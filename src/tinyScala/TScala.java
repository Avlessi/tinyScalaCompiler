package tinyScala;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import error.ErrorFlag;
import error.ErrorListener;
import ast.AST;
import parser.TScala0ASTVisitor;
import parser.TScala0Lexer;
import parser.TScala0Parser;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import javax.management.RuntimeErrorException;

public class TScala {
    public static void main(String[] args) throws Exception {
    	//supposition:
    	// 1) expression pas de string
    	// 2) pas de this implicite
    	// 3) types obligatoires
    	
    	//analyse sémantique: ajout un champ type à Expr et
    	//enregistrer le type lors de la troisième traversée
    	//exemple: e.foo() -> <classname>_foo()
    	
        String inputFile = null; 
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is); 
        TScala0Lexer lexer = new TScala0Lexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        TScala0Parser parser = new TScala0Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
        ParseTree tree = parser.program();
//        if(ErrorFlag.getFlag() == true) {
//        	System.out.println("parsing error!");
//        	throw new Exception("parsing error!");
//        }
        System.out.println("tree is:\n" + tree.toStringTree(parser));
        TScala0ASTVisitor visitor = new TScala0ASTVisitor();
        AST ast = visitor.visit(tree); 
                
        System.out.println("ast is:\n " + ast);
        System.out.println("genC() = ");
        System.out.println(ast.genC(0));
        //generate c
        write(ast.genC(0), inputFile);
        //System.out.println(ast.genC(0));
    }
    
 // write code to .c file associated to .tscala file passed as argument,
 	// returning .c file relative filename
     static String write(String code, String filename) throws IOException {
     	String CFilename = null;
     	if (filename == null){
     		PrintStream out = System.out;
     		out.print(code);
         	out.flush();
         	out.close();
     	} else {
     		CFilename = filename.replaceFirst("\\.tscala\\z", ".c");
     		//   	if (verbose) System.out.println("writing C code to " + CFilename);
     		FileWriter out = new FileWriter(CFilename);
     		//FileWriter out = new FileWriter("1.txt");
     		out.write(code);
     		out.flush();
     		out.close();
     	}
     	return CFilename;
     }
}        

package ast;

import java.util.List;

public class Program extends AST {

	private Expr expr;
	
	private List<Tclass> classes;
	
	
	public Program(Expr expr, List<Tclass> classes) {		
		this.expr = expr;
		this.classes = classes;
	}



	@Override
	public String toString() {
		String classes = "";
		for(Tclass classe:this.classes){
			classes += classe.toString()+" ";
		}
		if(this.classes.size()>0)classes = classes.substring(0, classes.length()-1);
		
		return expr.toString()+" "+classes;
	}

	@Override
	public String genC(int d) {
		String headers = "#include <stdio.h>\n#include <stdlib.h>\n";
		String classDefs = "";
		for(Tclass tclass: classes) {
			classDefs += tclass.genC(0);
		}
		String exprtemplate = headers + classDefs + " int main() {\n return printf(\"%%i\\n\", %s); 	\n}";
		String result = String.format(exprtemplate, expr.genC(0));
		return result;
	}
	
//	@Override
//	public String toString() {
//		return "Program(" + expr + ")";
//	}
}

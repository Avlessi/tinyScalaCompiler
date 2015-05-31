package parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import parser.TScala0Parser.ExprContext;
import parser.TScala0Parser.ExprsContext;
import ast.*;

public class TScala0ASTVisitor extends TScala0BaseVisitor<AST> {
	@Override public AST visitProgram(@NotNull TScala0Parser.ProgramContext ctx) {
		System.out.println("visit Program");
		Expr expr = (Expr) visit(ctx.expr());		
		List<TScala0Parser.TclassContext> classeCtxs = ctx.tclass();
		List<Tclass> classes = new ArrayList<Tclass>();
		for (TScala0Parser.TclassContext classeContext : classeCtxs) {
			classes.add((Tclass) visit(classeContext));
		}

		return new Program(expr, classes);		
	}
	
	@Override
	public AST visitTclass(@NotNull TScala0Parser.TclassContext ctx) {
		System.out.println("visit Class");
		ClassId classId = new ClassId(ctx.CLASSID().getText());
		Params params = null;
		if(ctx.params() != null)		
			params = (Params) visit(ctx.params());

		List<TScala0Parser.MethodContext> methodCtxs = ctx.method();		
		List<Method> methodes = new ArrayList<Method>();
		
		for (TScala0Parser.MethodContext methodeCtx : methodCtxs) {
			methodes.add((Method) visit(methodeCtx));
		}		
		return new Tclass(classId, params, methodes);
	}

	@Override
	public AST visitMethod(TScala0Parser.MethodContext ctx) {
		System.out.println("visit Method");
		Id id = new Id(ctx.ID().getText());
		Params params = (ctx.params()!=null)?(Params) visit(ctx.params()):null;
		ClassId classId = new ClassId(ctx.CLASSID().getText());
		Expr expr = (Expr) visit(ctx.expr());

		return new Method(id, params, classId, expr);
	}

	
	
	@Override public AST visitStrLit(@NotNull TScala0Parser.StrLitContext ctx) {
		System.out.println("visit StrLit");
		return new StrLit(ctx.getText());
	}

	@Override public AST visitBooLit(@NotNull TScala0Parser.BooLitContext ctx) {
		System.out.println("visit BooLit");
		return new BooLit(Boolean.parseBoolean(ctx.getText())); 
	}

	@Override public AST visitIntLit(@NotNull TScala0Parser.IntLitContext ctx) {
		System.out.println("visit IntLit");
		return new IntLit(Integer.parseInt(ctx.getText())); 
	}
	
	@Override
	public AST visitBinExpr(@NotNull TScala0Parser.BinExprContext ctx) { 
		//return visitChildren(ctx);
		System.out.println("visit BinExpr");		
		//System.out.println("operator = " + ctx.OP2().getText());		
		BinExpr binExpr = new BinExpr(new Op(ctx.OP2().getText()), (Expr) visit(ctx.getChild(0)), (Expr) visit(ctx.getChild(2)));
		return binExpr;
	}
	
	@Override
	public AST visitUnExpr(@NotNull TScala0Parser.UnExprContext ctx) {
		System.out.println("visit UnExpr");
		UnExpr unExpr = new UnExpr(new Op(ctx.OP1().getText()), (Expr) visit(ctx.getChild(1)) );
		return unExpr;
	}
	
	@Override 
	public AST visitParExpr(@NotNull TScala0Parser.ParExprContext ctx) {
		System.out.println("visit ParExpr");
		ParExpr parExpr = new ParExpr( (Expr) visit(ctx.expr())); 
		return parExpr;
	}
	
	@Override public AST visitCondExpr(@NotNull TScala0Parser.CondExprContext ctx) { 
		System.out.println("visit CondExpr");
		CondExpr condExpr = new CondExpr((Expr) visit(ctx.getChild(0)), (Expr) visit(ctx.getChild(2)), (Expr) visit(ctx.getChild(4)));
		return condExpr;
	}
	
	@Override
	public AST visitExprs(@NotNull TScala0Parser.ExprsContext ctx){
		List<TScala0Parser.ExprContext> exprCtxts = (List<TScala0Parser.ExprContext>) ctx.expr(); 
		List<Expr> exprs = new ArrayList<Expr>();
		for(TScala0Parser.ExprContext exprCtxt : exprCtxts){
			exprs.add((Expr)visit(exprCtxt));
		}		
		return new Exprs(exprs);
	}
	
	
	@Override
	public AST visitThis(@NotNull TScala0Parser.ThisContext ctx) {
		//ctx.getText();
		return new This();
	}

	@Override
	public AST visitNull(@NotNull TScala0Parser.NullContext ctx) {
		//ctx.getText();
		return new Null();
	}
	
	@Override
	public AST visitParam(@NotNull TScala0Parser.ParamContext ctx){
		System.out.println("visit Param");
		Id id = new Id(ctx.ID().getText());
		ClassId classId = new ClassId(ctx.CLASSID().getText());
		return new Param(id, classId);
	}
	
	@Override
	public AST visitParams(@NotNull TScala0Parser.ParamsContext ctx){
		System.out.println("visit Params");
		List<TScala0Parser.ParamContext> paramCtxts = ctx.param();
		List<Param> params = new ArrayList<Param>();
		for(TScala0Parser.ParamContext paramCtxt:paramCtxts){
			params.add((Param)visit(paramCtxt));
		}
		
		return new Params(params);
	}
	
	@Override
	public AST visitVariable(@NotNull TScala0Parser.VariableContext ctx) {
		System.out.println("visit Variable");
		return new Variable(new Id(ctx.ID().getText()));
	}

	@Override
	public AST visitFieldAccess(@NotNull TScala0Parser.FieldAccessContext ctx) {
		System.out.println("visit FieldAccess");
		Expr expr = (Expr) visit(ctx.expr());
		Id id = new Id(ctx.ID().getText());
		return new FieldAccess(expr, id);
	}

	@Override
	public AST visitMethodCall(@NotNull TScala0Parser.MethodCallContext ctx) {
		System.out.println("visit MethodCall");
		Expr expr = (Expr) visit(ctx.expr());
		Id id = new Id(ctx.ID().getText());
		Exprs exprs = ((ctx.exprs()!=null)?(Exprs) visit(ctx.exprs()):null);
		return new MethodCall(expr, id, exprs);
	}

	@Override
	public AST visitConstrCall(@NotNull TScala0Parser.ConstrCallContext ctx) {
		System.out.println("visit ConstrCall");
		ClassId classId = new ClassId(ctx.getText());
		Exprs exprs = (Exprs) visit(ctx.exprs());
		return new ConstrCall(classId, exprs);
	}
	
}

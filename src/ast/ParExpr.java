package ast;

public class ParExpr extends Expr {
	private Expr expr;
	
	public ParExpr(Expr expr) {
		this.expr = expr;
	}
	
	@Override
	public String genC(int d) {
		return "(" + expr.genC(0) + ")"; 
	}

}

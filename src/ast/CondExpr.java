package ast;

public class CondExpr extends Expr {
	private Expr condExpr;
	private Expr expr1;
	private Expr expr2;
	
	public CondExpr(Expr condExpr, Expr expr1, Expr expr2) {
		this.condExpr = condExpr;
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public String genC(int d) {
		return condExpr.genC(0) + "?" +  expr1.genC(0) + ":" + expr2.genC(0);
	}
}

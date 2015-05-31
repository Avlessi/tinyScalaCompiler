package ast;

public class UnExpr extends Expr {
	private Op op;
	private Expr expr;
	
	public UnExpr(Op op, Expr expr) {
		this.op = op;
		this.expr = expr;
	}
	
	@Override
	public String genC(int d) {
		return op.genC(0) + expr.genC(0);
	}
	
}

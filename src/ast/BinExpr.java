package ast;

public class BinExpr extends Expr {
	public Op op;
	public Expr expr1;
	public Expr expr2;
	
	public BinExpr(Op op, Expr expr1, Expr expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.op = op;
	}

	@Override
	public String genC(int d) {
		return expr1.genC(0) + op.genC(0) + expr2.genC(0);
	}
	
}

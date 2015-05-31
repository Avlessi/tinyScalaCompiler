package ast;

public class MethodCall extends Expr {
	
	private Expr expr;
	private Id id;
	private Exprs exprs;
	
	

	public MethodCall(Expr expr, Id id, Exprs exprs) {
		super();
		this.expr = expr;
		this.id = id;
		this.exprs = exprs;
	}
	
	public MethodCall(Expr expr, Id id){
		this(expr, id, null);
	}


	@Override
	public String toString() {
		return expr.toString()+"."+id+"("+((this.exprs!=null)?exprs.toString():"")+")";
	}

	@Override
	public String genC(int d) {
		// TODO Auto-generated method stub
		return null;
	}

}
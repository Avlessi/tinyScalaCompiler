package ast;

public class FieldAccess extends Expr {
	
	private Expr expr;
	
	private Id id;
	
	

	public FieldAccess(Expr expr, Id id) {		
		this.expr = expr;
		this.id = id;
	}



	@Override
	public String toString() {
		return expr.toString()+"."+id;
	}



	@Override
	public String genC(int d) {
		return expr.genC(0);
	}

}
   
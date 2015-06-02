package ast;

public class Variable extends Expr {
	private Id id;	
	
	public Variable(Id id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return id.toString();
	}

	@Override
	public String genC(int d) {
		return id.toString();
	}
	
}

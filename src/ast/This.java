package ast;

public class This extends Expr {
	
	@Override
	public String toString() {
		return "this";
	}

	@Override
	public String genC(int d) {
		return "this";
	}

}
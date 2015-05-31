package ast;

public class Null extends Expr {

	@Override
	public String toString() {
		return "null";
	}

	@Override
	public String genC(int d) {
		return "NULL";
	}

}
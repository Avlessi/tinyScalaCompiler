package ast;


public class StrLit extends Expr {
	String val;
	
	public StrLit(String val) {
		this.val = val;
	}

	@Override
	public String genC(int d) {
		return val;
	}

//	@Override
//	public String toString() {
//		return val;
//	}
}

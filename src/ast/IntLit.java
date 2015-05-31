package ast;


public class IntLit extends Expr {
	int val;
	
	public IntLit(int val) {
		this.val = val;
	}

	@Override
	public String genC(int d) {
		return String.valueOf(this.val);
	}

//	public String toString() {
//		return Integer.toString(val);
//	}
}

package ast;


public class BooLit extends Expr {
	boolean val;
	
	public BooLit(boolean val) {
		this.val = val;
	}

	@Override
	public String genC(int d) {
		if(!val)
			return "0";
		else
			return "1";
	}

//	public String toString() {
//		return Boolean.toString(val);
//	}
}

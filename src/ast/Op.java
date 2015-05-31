package ast;

public class Op extends AST {
	private String val;
	public Op(String val) {
		this.val = val;
	}
	
	@Override
	public String genC(int d) {
		return this.val;
	}	
	
}

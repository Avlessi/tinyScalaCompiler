package ast;

public class Id extends AST {

	private String value;

	public Id(String value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public String genC(int d) {
		return value;
	}

}
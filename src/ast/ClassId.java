package ast;

public class ClassId extends AST {
	private String value;

	public ClassId(String value) {		
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
	
	public String getCiEquivName() {
		if(value.equals("Integer"))
			return "int";
		else if(value.equals("Boolean")) {
			return "int";		
		}
		else if (value.equals("Float")) {
			return "float";
		}
		else 
			return value;
	}
}

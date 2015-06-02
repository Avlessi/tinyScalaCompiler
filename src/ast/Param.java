package ast;

import java.util.List;

public class Param extends AST {
	/*private String paramname;
	private String classname;
	
	public Param(String paramname, String classname) {
		this.paramname = paramname;
		this.classname = classname; 
	}

	@Override
	public String genC(int d) {
		return this.classname + " " +  this.paramname;
	}
	
	public static String genCParams(List<Param> params) {
		StringBuilder lineBuilder = new StringBuilder();
		for(Param param : params) { 
			lineBuilder.append(param.genC(0));
			lineBuilder.append(';');
			lineBuilder.append('\n');
		}		
		return lineBuilder.toString();
	}*/
	
	
	private Id id;
	private ClassId classId;

	public Param(Id id, ClassId classId) {
		super();
		this.id = id;
		this.classId = classId;
	}
	
	public Id getId() {
		return id;
	}
	
	@Override
	public String genC(int d) {		
		return this.classId.getCiEquivName() + " " +  this.id;
	}

	@Override
	public String toString() {
		return id.toString()+" "+classId.toString();
	}
	
	
	
	
}

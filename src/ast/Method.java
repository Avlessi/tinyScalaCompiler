package ast;

import java.util.List;

public class Method extends AST {
	private Id id;
	private Params params;
	private ClassId classId;
	private Expr expr;

	public Method(Id id, Params params, ClassId classId, Expr expr) {
		super();
		this.id = id;
		this.params = params;
		this.classId = classId;
		this.expr = expr;
	}
	
	public Method(Id id, ClassId classId, Expr expr){
		this(id, null, classId, expr);
	}

	@Override
	public String toString() {
		return id.toString()+" ( "+((this.params !=null)?params.toString():"")+" : "+classId.toString()+" = "+expr;
	}
	

	@Override
	public String genC(int d) {
		return "";
	}	
	 
}

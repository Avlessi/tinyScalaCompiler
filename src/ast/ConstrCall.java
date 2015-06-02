package ast;

public class ConstrCall extends Expr {
	
	private ClassId classId;
	private Exprs exprs;
	

	public ConstrCall(ClassId classId, Exprs exprs) {	
		this.classId = classId;
		this.exprs = exprs;
	}
	
	public ConstrCall(ClassId classId){
		this(classId, null);
	}

	public ClassId getClassId() {
		return this.classId;
	}

	@Override
	public String toString() {
		return classId.toString()+"("+((this.exprs !=null) ? this.exprs.toString() : "") +")";
	}

	@Override
	public String genC(int d) {				
		//return exprs.genC(0);
		return this.classId + "_new(" + ((this.exprs !=null) ? this.exprs.genC(0) : "") + ")";
	}

}

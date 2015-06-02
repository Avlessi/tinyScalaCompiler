package ast;

import java.util.List;
import java.util.ArrayList;

public class MethodCall extends Expr {
	
	private Expr expr; // in fact, it is class name with eventual parameters, for example Foo()
	private Id methodId;
	private Exprs exprs;
	
	

	public MethodCall(Expr expr, Id id, Exprs exprs) {
		super();
		this.expr = expr;
		this.methodId = id;
		this.exprs = exprs;
	}
	
	public MethodCall(Expr expr, Id id){
		this(expr, id, null);
	}


	@Override
	public String toString() {
		
		//add to exprs constrCall
		return expr.toString()+"."+methodId+"("+((this.exprs!=null) ? exprs.toString() : "")+")";
	}

	@Override
	public String genC(int d) {
		//TODO what about expr.genC()  ?
		ConstrCall c = (ConstrCall) this.expr;
				
		if (this.exprs == null) 
		{
			List<Expr> exprList = new ArrayList<Expr>();	
			exprList.add(c);
			this.exprs = new Exprs(exprList);
		}
		else
			this.exprs.addExpr(c);
//		
////		if(this.exprs != null) {
////			this.exprs.addExpr(c);
////		}
		
		return c.getClassId() + "_" + methodId + "(" + ((exprs != null) ? exprs.genC(0) : "") + ")";
	}

}
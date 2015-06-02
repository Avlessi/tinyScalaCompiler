package ast;

import java.util.List;

public class Exprs extends AST{
	private List<Expr> exprs;

	public Exprs(List<Expr> exprs) {
		super();
		if (exprs.size() >= 1) {
			this.exprs = exprs;
		} else {
			throw new RuntimeException("Expression list is empty!");

		}
	}
	
	public void addExpr(Expr expr) {
		exprs.add(expr);
	}

	@Override
	public String toString() {
		
		String toRet ="";
		for(Expr expr:exprs){
			toRet+=expr.toString()+", ";
		}
		toRet = toRet.substring(0, toRet.length()-2);
		
		return toRet;
	}

	@Override
	public String genC(int d) {
		StringBuilder lineBuilder = new StringBuilder();
		for(Expr expr: exprs) {
			lineBuilder.append(expr.genC(0));
			lineBuilder.append(",");
		}		
		return lineBuilder.substring(0, lineBuilder.length() - 1); // delete comma
	}
}

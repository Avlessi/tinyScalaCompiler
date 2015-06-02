package ast;

import java.util.List;

public class Params extends AST {

	private List<Param> params;
	
	public Params(List<Param> params) {		
		if (params != null && params.size() >= 1) {
			this.params = params;
		} else {
			throw new RuntimeException();
		}
	}		
	

	@Override
	public String toString() {
		
		String toRet ="";
		for(Param param : params){
			toRet += param.toString()+", ";
		}
		toRet = toRet.substring(0, toRet.length()-1);
		return toRet;
	}

	
	public List<Param> getParamList() {
		return this.params;
	}
	
	public void addParam(Param par) {
		params.add(par);
	}


	@Override
	public String genC(int d) {
		StringBuilder lineBuilder = new StringBuilder();
		for(Param param: params) {
			lineBuilder.append(param.genC(0));			
			lineBuilder.append(",");
		}	
		return lineBuilder.substring(0, lineBuilder.length() - 1);  //suppress last comma
	}
	
	public String genCStructParams() {
		StringBuilder lineBuilder = new StringBuilder();
		for(Param param: params) {
			lineBuilder.append(param.genC(0));			
			lineBuilder.append(";"); 			
		}		
		return lineBuilder.toString(); 		
	}

}
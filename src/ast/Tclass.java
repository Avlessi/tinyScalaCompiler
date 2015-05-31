package ast;

import java.util.ArrayList;
import java.util.List;

public class Tclass extends AST {
	/*private String classname;
	private List<Param> params;
	private List<Method> methods; 
	
	public Tclass(String name, List<Param> params) {
		this.classname = classname;
		this.params = params;
	}
	

	@Override
	public String genC(int d) {
		String typedefTemplate = "typedef struct %s_str *%s;\n";
		String structTemplate = "struct %s_str {\n%s};\n";
		String ConstructorTemplate = "%s %s_new(%s) {\n} %s this; \n this = malloc(sizeof(struct %s_str) )";
		return String.format(typedefTemplate, classname, classname) + String.format(structTemplate, classname, Param.genCParams(params)) 
				+ String.format(ConstructorTemplate, classname, classname, Param.genCParams(params), classname);
	}*/
	
	private ClassId classId;
	private Params params;
	private List<Method> methods;
	
	
	
	public Tclass(ClassId classId, Params params, List<Method> methods) {		
		this.classId = classId;
		this.params = params;
		this.methods = new ArrayList<Method>(methods);
	}
	
	public Tclass(ClassId classId, ArrayList<Method> methods){
		this(classId, null, methods);
	}


	/*@Override
	public String genC(int d) {
		String typedefTemplate = "typedef struct %s_str *%s;\n";
		String structTemplate = "struct %s_str {\n%s};\n";
		String ConstructorTemplate = "%s %s_new(%s) {\n} %s this; \n this = malloc(sizeof(struct %s_str) )";
		return String.format(typedefTemplate, classId, classId) + String.format(structTemplate, classId, Param.genCParams(params)) 
				+ String.format(ConstructorTemplate, classname, classname, Param.genCParams(params), classname);
	}*/
	

	@Override
	public String toString() {
		return "class "+((this.classId !=null)?classId.toString():"")+"("+((this.params !=null)?params.toString():"")+")";
	}

	@Override
	public String genC(int d) {
		String typedefTemplate = "typedef struct %s_str *%s;\n";
		String structTemplate = "struct %s_str {\n%s};\n";
		
		return String.format(typedefTemplate, this.classId, this.classId) + String.format(structTemplate, this.classId, ((params != null) ? params.genC(0) : ""));
		
		//String ConstructorTemplate = "%s %s_new(%s) {\n} %s this; \n this = malloc(sizeof(struct %s_str) )";
		//return String.format(typedefTemplate, this.classId, this.classId) + String.format(structTemplate, this.classId, params.genC(0)) 
		//		+ String.format(ConstructorTemplate, classId, classId, params.genC(0), this.classId);		
	}
	
	
}

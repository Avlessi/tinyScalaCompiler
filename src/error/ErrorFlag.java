package error;

public class ErrorFlag {
	private static boolean flag = false;
	
	public static void setFlag() {
		flag = true;
	}
	
	public static void resetFlag() {
		flag = false;
	}
	
	public static boolean getFlag() {
		return flag;
	}
}

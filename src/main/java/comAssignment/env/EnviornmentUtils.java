package comAssignment.env;

public enum EnviornmentUtils {
	Dev("dev"), 
	STAGE("stage"), 
	PRODUCTION("Production");

	private String name;

	EnviornmentUtils(String browserName) {
		name = browserName;
	}
	
	
	
	public String getEnvironmentName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
		
	}
	

}

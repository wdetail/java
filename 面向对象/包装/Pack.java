package °ü×°;

public class Pack {
	
	private boolean hasDigit;
	private boolean hasUpper;
	private boolean hasLower;
	private boolean hasSpace;
	
	private String level = "";

	public boolean isHasDigit() {
		return hasDigit;
	}

	public void setHasDigit(boolean hasDigit) {
		this.hasDigit = hasDigit;
	}

	public boolean isHasUpper() {
		return hasUpper;
	}

	public void setHasUpper(boolean hasUpper) {
		this.hasUpper = hasUpper;
	}

	public boolean isHasLower() {
		return hasLower;
	}

	public void setHasLower(boolean hasLower) {
		this.hasLower = hasLower;
	}

	public boolean isHasSpace() {
		return hasSpace;
	}

	public void setHasSpace(boolean hasSpace) {
		this.hasSpace = hasSpace;
	}

	public String getlevel(){
		
		if(hasDigit) level += "¡ï";
		if(hasUpper) level += "¡ï";
		if(hasLower) level += "¡ï";
		if(hasSpace) level += "¡ï";
		
		return level;
	}

}

package øº ‘;

public class Option {
	
	private char select;
	private String content;
	
	public Option() {
	}
	
	public Option(char select, String content) {
		super();
		this.select = select;
		this.content = content;
	}
	public char getSelect() {
		return select;
	}
	public void setSelect(char Select) {
		this.select =Select;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}

package ����;

public class User {//�û�
	
	private String name;
	private String gender;//�Ա�
	private String tel;
	private String ID;//���֤��	
	
	public User() {	}

	public User(String name, String gender, String tel, String iD) {
		this.name = name;
		this.gender = gender;
		this.tel = tel;
		this.ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", tel=" + tel + ", ID=" + ID + "]";
	}
	

}

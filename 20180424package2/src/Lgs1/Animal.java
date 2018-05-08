package Lgs1;

public class Animal {
	public String publicField;
	private String privateField;
	String pakageField;
	
	//protected: 패지키지 여부와 상관없이 상속됨. 동일 패키지 내에서는 Public, 타 패키지에서는 private
	protected String protectedField;
	public Animal () {
		publicField = "public";
		privateField = "private";
		pakageField = "pakage";
		protectedField = "protected";
	}

}

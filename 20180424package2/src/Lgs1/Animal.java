package Lgs1;

public class Animal {
	public String publicField;
	private String privateField;
	String pakageField;
	
	//protected: ����Ű�� ���ο� ������� ��ӵ�. ���� ��Ű�� �������� Public, Ÿ ��Ű�������� private
	protected String protectedField;
	public Animal () {
		publicField = "public";
		privateField = "private";
		pakageField = "pakage";
		protectedField = "protected";
	}

}

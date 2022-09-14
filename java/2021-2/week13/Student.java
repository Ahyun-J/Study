package week13;

class Student {
	private String name;
	private String phone;

public Student() {
	this("None", "None");
 }

	public Student(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

@Override
public String toString() {
return "Student [name=" + name + ", phone=" + phone + "]";
	}
}
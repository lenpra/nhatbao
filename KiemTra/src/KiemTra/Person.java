package KiemTra;

import java.util.Date;

public abstract class Person {
	String name;
	Date birthday;
	byte gender;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Date birthday, byte gender) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}
	
	
}

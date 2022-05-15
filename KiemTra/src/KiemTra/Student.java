package KiemTra;

import java.io.Serializable;
import java.util.Date;

public class Student extends Person implements Serializable,Comparable {
	String StudentID;
	String major;
	Date enrollDate;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Date birthday, byte gender) {
		super(name, birthday, gender);
		// TODO Auto-generated constructor stub
	}

	public Student(String studentID, String major, Date enrollDate) {
		super();
		StudentID = studentID;
		this.major = major;
		this.enrollDate = enrollDate;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	@Override
    public String toString() {
        return "student name: " + name + " StudentID: " + StudentID +" Student birthday: " +birthday+" Student gender: "+ gender+" Student major: "+ major+" Student enroll date: "+ enrollDate+"\n" ;
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

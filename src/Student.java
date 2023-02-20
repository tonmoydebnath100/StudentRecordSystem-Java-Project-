//Inheritance - The program needs to have at least one (1) superclass and two (2)
//subclasses. Each of the classes must have at least two (2) attributes.
//Student is the super class and it has two subclasses graduateStudent and undergraduateStudent

public class Student{
	
	//Final keywords- There should be one (1) final attribute

	protected final static int instituteBranchCode = 209 ;
	private String studentName;
	private int studentRollNo;
	private String studentSection;
	
	public Student(String name, int rollNo, String section)
	{
		this.studentName = name;
		this.setStudentRollNo(rollNo);
		this.studentSection = section;
	}	
	
	//Encapsulation - All attributes must be fully encapsulated.
	//These getters and setters are performing encaspulation of the instance variables
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}

	//Final keywords- There should be one one (1) final method and one
	public final int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	
	 public String toString()
	{
		return "Institute Branch Code: "+this.instituteBranchCode+"\n"
				+"Student Name: "+this.getStudentName()+"\n"
				+"Student Roll Number: "+"\n"
				+"Student Section: "+this.getStudentSection()+"\n\n";
	}
	 
	
}
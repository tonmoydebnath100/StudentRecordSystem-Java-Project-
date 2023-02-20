
//Inheritance - The program needs to have at least one (1) superclass and two (2)
//subclasses. Each of the classes must have at least two (2) attributes.
//undergraduateStudent is one of the two subclasses


//Final keywords- There should be one (1) final class

public final class UndergraduateStudent extends Student {


	private String programName;
	private int year;
	
	public UndergraduateStudent(String name, int rollNo, String section, String program, int year) {
		super(name, rollNo, section);
		this.programName = program;
		this.year = year;
	}
	
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//Polymorphism - There should be one instance of method overriding.
	//This method will be overriden in both graduate and undergraduate classes
	public String toString()
	{
		return "Institute Branch Code: "+Student.instituteBranchCode+"\n"
				+"Student Name: "+this.getStudentName()+"\n"
				+"Student Roll Number: "+"\n"
				+"Student Section: "+this.getStudentSection()+"\n"
				+"Student program: "+this.getProgramName()+"\n"
				+"Student Year: "+this.getYear()+"\n\n";
	}
	
}

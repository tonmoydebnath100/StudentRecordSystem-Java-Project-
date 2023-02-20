
//Inheritance - The program needs to have at least one (1) superclass and two (2)
//subclasses. Each of the classes must have at least two (2) attributes.
//GraduateStudent is one of the two subclasses

//Final keywords- There should be one (1) final class


public final class GraduateStudent extends Student {
	
	private String thesisTitle;
    private String supervisorName;
    
    
    public GraduateStudent(String name, int rollNo, String section, String title, String supervisor) {
  		super(name, rollNo, section);
  		this.thesisTitle = title;
  		this.supervisorName = supervisor;
  	}
    
	public String getThesisTitle() {
		return thesisTitle;
	}
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	
	//Polymorphism - There should be one instance of method overriding.
	//This method will be overriden in both graduate and undergraduate classes
	public String toString()
	{
		return "Institute Branch Code: "+Student.instituteBranchCode+"\n"
				+"Student Name: "+this.getStudentName()+"\n"
				+"Student Roll Number: "+"\n"
				+"Student Section: "+this.getStudentSection()+"\n"
				+"Student Thesis Title: "+this.getThesisTitle()+"\n"
				+"Student's Supervisor name: "+this.getSupervisorName()+"\n\n";
	}
   
}
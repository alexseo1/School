public class Student {
    
    private String uni;
    private String name;
    private int credits;
    
    private Assignment currentAssignment;
    
    //constructor
    public Student(String uni, String name, Assignment assignment){
        this.uni = uni;
        this.name = name; 
        this.credits = 4; //let's say one AP class in high school
        this.currentAssignment = assignment;
    }
    
    //accessor methods
   	
	public String getUni(){
		return uni;
    }	
    public String getName(){
        return name;
    }
    public int getCredits(){
        return credits;
    }
    
    public Assignment getAssignment(){
        return currentAssignment;
    }
    
    public void setAssignment(Assignment a){
        currentAssignment = a;
    }
    
    public String getDueDate(){
        return currentAssignment.getDueDate();
    }
    
    public void getExtension(String newDate){
        currentAssignment.setDueDate(newDate);
    }
    
    public String toString(){
        return "Student: " + name + " uni: " + uni + " is currently working on " + currentAssignment.toString();
    }

   
    //mutator methods
	public void addCredits(int credits){
		this.credits += credits;
    }

    public void changeName(String newname){
        name = newname;
    }
    
    
    public boolean isGraduating(){
        if(credits >= 124){
            return true;
        } else {
            return false;
        }
    }
    
}

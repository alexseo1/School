public class Assignment {
    
    String dueDate;
    String name;
    int gradePercent;
    
    //duedate: MMDDYYYY, gradePercent example:  30
    public Assignment(String dueDate, String name, int gradePercent){
        this.dueDate = dueDate;
        this.name = name;
        this.gradePercent = gradePercent;
        
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDueDate(String newDate){
        dueDate = newDate;
    }
    
    public int getGradePercent(){
        return gradePercent;
    }
    
    public String toString(){
        return "Assignment " + name + " due on " + dueDate + " worth " + gradePercent + " percent.";
    }
    
}

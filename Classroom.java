public class Classroom {
    
    private String building;
    private String name;
    
    private Student student1;
    private Student student2;
    private Student student3;
    
    public Classroom(String building, String name){
        this.building = building;
        this.name = name;
        
        student1 = null;
        student2 = null;
        student3 = null;
    }
    
    public boolean addStudent(Student s){
        if(student1 == null){
            student1 = s;
            return true;
            
        } else if (student2 == null){
            student2 = s;
            return true;
            
        } else if (student3 == null){
            student3 = s;
            return true;
            
        } else {
            return false;
            
        }
    }
    
    public void giveAssignment(String dueDate,String name, int gradePercent) {
        Assignment a = new Assignment(dueDate, name, gradePercent);
        
        if(student1 != null){
            student1.setAssignment(a);
        }
        if(student2 != null){
            student2.setAssignment(a);
        }
        if(student3 != null){
            student3.setAssignment(a);
        }
        
    }
    
    public void removeStudent(String uni){
        if(student1 != null && student1.getUni().equals(uni)){
                student1 = null;
        } else if(student2 != null && student2.getUni().equals(uni)){
                student2 = null;
        
        } else if(student3 != null && student3.getUni().equals(uni)){
                student3 = null;
        } else {
            System.out.println("Requested student does not exist");
        }
        
    }
    
    public String getStudents(){
        String result = "";
        
        if(student1 != null){
            result += student1;
        }
        if(student2 != null){
            result += student2;
        }
        if(student3 != null){
            result += student3;
        }
        
        if(result.equals("")){
            return "No Students";
        } else {
            return result;
        }
        
        
    }
    
    
}

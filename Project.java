
public class Project
{
     private String name;
     private String description;
     private double initialCost;
     private float cost;
    public Project() {
       
    }
     public Project( String name) {
       this.name = name;
    }
       public Project( String name, String description) {
       this.name = name;
       this.description = description;
    }
    
       public Project( String name, String description, double initialCost, 
       float cost) {
       this.name = name;
       this.description = description;
       this.initialCost = initialCost;
       this.cost = cost; 
    }
    
    public String getProjectName() {
        return this.name;
    }
     
    public void setProjectName(String name) {
       this.name = name;
    }
    
      public String getProjectDesc() {
        return this.description;
    }
    
      public void setProjectDesc(String description) {
       this.description = description ;
    }
    
    public double getProjectiniCost(){
        return this.initialCost;
    }
    
     public void setProjectiniCost( double initialCost){
        this.initialCost = initialCost;
    }
    
    public float getProjectCost() {
        return this.cost;
    }
    
    public void setProjectCost(float cost) {
         this.cost = cost;
    }
    
    public String elevatorPitch() {
	return this.name + " ($" + this.cost + "): " + this.description;
	}
}

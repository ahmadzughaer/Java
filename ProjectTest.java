public class ProjectTest {
	
	// Testing out our Project class
    public static void main(String[] args) {
        Project project = new Project("French Langauge", "French intermediate level", 10, 1000);
        System.out.println(project.elevatorPitch());

        Project project2 = new Project();
        project2.setProjectName("Coding Dojo");
        project2.setProjectDesc("Onsite and Online courses");
        project2.setProjectCost(3000);
        
        Project project3 = new Project("Codacedmy", "Very useful courses" );
        project3.setProjectCost(1500);
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());

    }
}
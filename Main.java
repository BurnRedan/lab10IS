public class Main {

    public static void main(String[] argv) {

        Project project = new Project();
        ResearchAssociate projectMan = new ResearchAssociate(01, "Andrew", "goga@gmail.com", 500, "sociology");
        project.setName("Research");
        project.setStart("15.12.2022");
        project.setEnd("18.12.2022");
        project.addParticipant(projectMan);
        System.out.println(project.getName());
        System.out.println(project.getStart());
        System.out.println(project.getEnd());

    }
}

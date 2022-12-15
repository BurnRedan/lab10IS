public class ResearchAssociate extends Employee {

	public String fieldOfStudy;

	public ResearchAssociate(int ssNo, String name, String email, int counter, String fieldOfStudy) {
		super(ssNo, name, email, counter);
		this.fieldOfStudy = fieldOfStudy;
	}


	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public String getFieldOfStudy(){
		return fieldOfStudy;
	}
}
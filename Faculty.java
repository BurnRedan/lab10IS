public class Faculty {

	public Employee dean;
	public String name;

	Faculty(Employee dean, String name){
		this.dean = dean;
		this.name = name;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public void setName(String name){
		this.name = name;
	}
}
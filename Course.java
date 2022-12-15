import java.util.*;

public class Course {

	Collection<Lecturer> teaches;
	public String name;
	public int id;
	public float hours;

	public Course(String name, int id, float hours){
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	public Course(Collection<Lecturer> teaches, String name, int id, float hours){
		this.teaches = teaches;
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTeaches(Collection<Lecturer> teaches) {
		this.teaches = teaches;
	}

	public String getName() {
		return name;
	}

	public Collection<Lecturer> getTeaches() {
		return teaches;
	}

	public float getHours() {
		return hours;
	}

	public int getId() {
		return id;
	}

	public void addLecturer(Lecturer lecturer){
		this.teaches.add(lecturer);
	}
}
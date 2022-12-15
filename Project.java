import java.util.*;

public class Project {

	public String name;
	public String start;
	public String end;
	public List<ResearchAssociate> participants = new ArrayList<>();


	public Project(){
	}

	public Project(String name, String start, String end){
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public void addParticipant(ResearchAssociate participant){
		this.participants.add(participant);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getName() {
		return name;
	}

	public Collection<ResearchAssociate> getParticipants() {
		return participants;
	}

	public String getEnd() {
		return end;
	}

	public String getStart() {
		return start;
	}

	public void startProject(){

	}

	public void endProject(){

	}



}
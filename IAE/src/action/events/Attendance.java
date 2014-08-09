package action.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import action.base.BaseAction;
import data.*;

public class Attendance extends BaseAction{
	
	public String execute() {
		return "success";
	}
	
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	Event getEvent() { 
		return services.getEventById(id);
	}
	
	public String getEventName() {
		return getEvent().getName();
	}
	
	public Set<Person> getAttendees() {
		return getEvent().getPeople();
	}
	
	public List<Person> getNonAttendees() {
		List<Person> nonAttendees = new ArrayList<Person>();
		for(Person person: services.getPeople()) {
			if(!getAttendees().contains(person)) {
				nonAttendees.add(person);
			}
		}
		return nonAttendees;
	}

}

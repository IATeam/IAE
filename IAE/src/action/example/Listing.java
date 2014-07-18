package action.example;

import java.util.List;

import data.Event;
import action.base.BaseAction;

public class Listing extends BaseAction{
	
	List<Event> events;
	
	public String execute(){
		events = services.getEvents();
		return "success";
	}
	
	
	public List<Event> getEvents() {
		return events;
	}
}

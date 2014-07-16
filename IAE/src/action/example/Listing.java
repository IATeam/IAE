package action.example;

import java.util.List;

import data.Event;
import action.base.BaseAction;

public class Listing extends BaseAction{
	public String execute(){
		events = services.getEvents();
		return "success";
	}
	
	List<Event> events;
	public List<Event> getEvents() {
		return events;
	}
}

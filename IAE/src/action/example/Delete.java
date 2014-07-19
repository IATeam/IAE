package action.example;

import data.Event;
import action.base.BaseAction;

public class Delete extends BaseAction{
	
	public String execute() {
		// cannot set value for isPostBack from jsp, should be automatically setted by calling setIsPostBack()
		if(isPostBack) {
			System.out.println("called");
			services.deleteEventById(id);
			return redirect("Listing.action");
		}
		return "success";
	}
	
	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	boolean isPostBack;
	public void setIsPostBack(boolean value) {
		this.isPostBack = value;
	}


	Event getEvent() {
		return services.getEventById(id);
	}
	
	public String getEventName() {
		//System.out.println(getEvent().getName());
		return getEvent().getName();
	}
	
}

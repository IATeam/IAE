package action.example;

import java.util.List;

import data.Event;
import data.GenderTypes;
import action.base.BaseAction;

public class Listing extends BaseAction{
	
	GenderTypes ge;
	Integer a=1;
	
	public String execute(){
		ge = services.getGenderTypeById(a);
		return "success";
	}
}

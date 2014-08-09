package action.radio;

import java.util.ArrayList;

import action.base.BaseAction;

public class RadioAction extends BaseAction{
	private ArrayList<String> optionsList;
	private String option;
	
	public String execute(){
		optionsList = new ArrayList<String>();
		optionsList.add("Database");
		optionsList.add("Document");
		optionsList.add("Report");
		return "INDEX";
	}

	public ArrayList<String> getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(ArrayList<String> optionsList) {
		this.optionsList = optionsList;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	
}

package br.com.pelodan.casechange.system;

public class SystemLogic {

	private String string = "Insira seu texto aqui";
	//Constructor
	public SystemLogic(){	}
	//Getters & Setters
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	//Methods
	public void toUpperCaseTransform () {
		string = string.toUpperCase();
	}
	public void toLowerCaseTransform () {
		string = string.toLowerCase();
	}
	public void toTitledCaseTransform(){
	    String[] words = string.split("\\s");
	    StringBuilder sb = new StringBuilder();

	    for(int i = 0; i < words.length; i++){
	        sb.append(words[i].substring(0, 1).toUpperCase() 
	        		+ words[i].substring(1).toLowerCase());
	        sb.append(" ");
	    }

	    string = sb.toString();
	}
}

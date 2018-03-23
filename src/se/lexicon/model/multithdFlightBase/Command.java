package se.lexicon.model.multithdFlightBase;

import se.lexicon.model.Airplane1;

public class Command {
private String command;
private Airplane1 airplane;
    
//    public Command(String str){
//        this.command=str;
//    }

	public Command(String command, Airplane1 airplane) {
		super();
		this.command = command;
		this.airplane = airplane;
	}	

	public String getCommand() {
        return command;
    }

	public void setCommand(String str) {
        this.command=str;
    }

}

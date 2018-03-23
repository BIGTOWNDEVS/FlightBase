package se.lexicon.model.multithdFlightBase;

import java.util.GregorianCalendar;
import java.util.List;

import se.lexicon.model.Airplane1;

public class ControlWaiter implements Runnable {

    private Command command;
    private Airplane1 airplane;
    
    GregorianCalendar gc = new GregorianCalendar();
    
    public ControlWaiter(Command command, Airplane1 airplane) {
		super();
		this.command = command;
		this.airplane = airplane;
	}

//	public ControlWaiter(Command m){
//        this.command=m;
//        
//    }

	@Override
	public void run() {
       String name = Thread.currentThread().getName();

       synchronized (command) {
		    try{
		        System.out.println(name+" waiting to get notified at time: "+ gc.getTime());
		        airplane.wait();
		        command.wait();
		    }catch(InterruptedException e){
		        e.printStackTrace();
		    }
		    gc.add(GregorianCalendar.MINUTE, 2);
		    System.out.println(name+" waiter thread got notified at time:"+ gc.getTime());
		    //process the message now
		    System.out.println(name+" processed: "+command.getCommand());
		    }
		}

}

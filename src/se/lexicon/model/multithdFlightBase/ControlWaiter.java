package se.lexicon.model.multithdFlightBase;

import java.util.GregorianCalendar;

public class ControlWaiter implements Runnable {

    private Command command;
    GregorianCalendar gc = new GregorianCalendar();
    
    public ControlWaiter(Command m){
        this.command=m;
        
    }

	@Override
	public void run() {
       String name = Thread.currentThread().getName();

       synchronized (command) {
		    try{
		        System.out.println(name+" waiting to get notified at time: "+ gc.getTime());
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

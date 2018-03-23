package se.lexicon.model.multithdFlightBase;

import se.lexicon.model.Airplane1;

public class ControlNotifier implements Runnable {

    private Command command;
    private Airplane1 airplane;
    
    
    
public ControlNotifier(Command command, Airplane1 airplane) {
		super();
		this.command = command;
		this.airplane = airplane;
	}

//    public ControlNotifier(Command command) {
//        this.command = command;
//    }

	@Override
	public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (airplane) {
				System.out.println(airplane.getArrivalTime());
				//System.out.println(airplane.get);
			}
            synchronized (command) {
            	command.setCommand(name+" Notifier work done");
                //command.notify();
                 command.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 	}

}

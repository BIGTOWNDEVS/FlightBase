package se.lexicon.model.multithdFlightBase;

public class FlightControl {

	public void Control() {

		Command command = new Command("process it");
	    
	    ControlWaiter controlWaiter = new ControlWaiter(command);
	    new Thread(controlWaiter,"ControlWaiter").start();
	    
	    ControlWaiter controlWaiter1 = new ControlWaiter(command);
	    new Thread(controlWaiter1, "controlWaiter1").start();
	    
	    ControlNotifier controlNotifier = new ControlNotifier(command);
	    new Thread(controlNotifier, "controlNotifier").start();
	    System.out.println("All the threads are started");
	}

}

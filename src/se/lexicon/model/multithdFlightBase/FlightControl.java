package se.lexicon.model.multithdFlightBase;

import java.util.ArrayList;
import java.util.List;

import se.lexicon.model.Airplane1;

public class FlightControl {

	List<Airplane1> airplaneList;
	
	public FlightControl(List<Airplane1> airplaneList) {
		super();
		this.airplaneList = airplaneList;
	}

	public void Control() {

		Command command = new Command("process it", airplaneList.get(0));
	    
	    ControlWaiter controlWaiter = new ControlWaiter(command, airplaneList.get(0));
	    new Thread(controlWaiter,"ControlWaiter").start();
	    
	    ControlWaiter controlWaiter1 = new ControlWaiter(command, airplaneList.get(1));
	    new Thread(controlWaiter1, "controlWaiter1").start();
	    
	    ControlWaiter controlWaiter2 = new ControlWaiter(command, airplaneList.get(2));
	    new Thread(controlWaiter2, "controlWaiter1").start();
	    
	    ControlNotifier controlNotifier = new ControlNotifier(command, airplaneList.get(0));
	    new Thread(controlNotifier, "controlNotifier").start();
	    System.out.println("All the threads are started");
	}

}

package se.lexicon.model.multithdFlightBase;

public class ControlNotifier implements Runnable {

    private Command command;
    
    public ControlNotifier(Command command) {
        this.command = command;
    }

	@Override
	public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
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

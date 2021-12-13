package Broker;

public class Main {

	
	public static void main(String[] args) throws InterruptedException {

		Broker broker = new Broker(54);
		Cliente cliente1 = new Cliente(broker, "Maria");
		Cliente cliente2 = new Cliente(broker, "Vanesa");
		Cliente cliente3 = new Cliente(broker, "Luis");
		Cliente cliente4 = new Cliente(broker, "Alberto");
	
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
		
		broker.waitUntilNoSharesAvailable();
		
		cliente1.interrupt();
		cliente2.interrupt();
		cliente3.interrupt();
		cliente4.interrupt();
		
		cliente1.join();
		cliente2.join();
		cliente3.join();
		cliente4.join();
	
	}

}

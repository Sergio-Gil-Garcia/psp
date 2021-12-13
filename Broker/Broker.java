package Broker;

public class Broker {

	private int accionesMaximas;
	private int accionesDisponibles;

	public Broker(int accionesMaximas) {
		super();
		this.accionesMaximas = accionesMaximas;
		this.accionesDisponibles = accionesMaximas;
	}
	
	public synchronized boolean buy(int cantidadComprar) {

		System.out.printf("Broker: there's %d available shares %n", accionesDisponibles);
		if(cantidadComprar <= accionesDisponibles) {
			
			accionesDisponibles -= cantidadComprar;
			System.out.printf("Broker: now there's %d available shares %n", accionesDisponibles);
			notifyAll();
			return true;
		} else {
			
			notifyAll();
			return false;
		}
	}
	
	public synchronized void waitUntilNoSharesAvailable() throws InterruptedException {

		while(accionesDisponibles > 0) {
			
			wait();
		}
		
		notifyAll();
	}
}

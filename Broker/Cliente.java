package Broker;

public class Cliente extends Thread {

	private int accionesCompradas;
	private Broker broker;
	private String nombre;
		
		
	public Cliente(Broker broker, String nombre) {
		
		this.broker = broker;
		this.nombre = nombre;
	}


	@Override
	public void run() {
			
		while(true) {
				
			 try {
				
				int aleatorio = (int) (Math.random() + 1 * 6);
				Thread.sleep(1000+(int)(Math.random()*2000));
				System.out.printf("Client %s about to buy %d shares %n", nombre, aleatorio);
				if(broker.buy(aleatorio)) {
					
					System.out.printf("Client %s bought %d shares %n", nombre, aleatorio);
					accionesCompradas += aleatorio;
				}
			} catch (InterruptedException e) {

				System.out.printf("Client %s bought %d shares in total %n", nombre, accionesCompradas);
				break;
			}
		}
	}
}

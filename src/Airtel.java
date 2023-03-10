package interfaces;

public class Airtel implements Account,Sim {

	@Override
	public void calling() {
	   System.out.println("Airtel is calling");
		
	}

	@Override
	public void browsing() {
	    System.out.println("Airtel is browsing");
		
	}

	@Override
	public void bill() {
		System.out.println("bill");
		
	}

}

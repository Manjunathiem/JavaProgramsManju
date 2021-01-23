package test;

public class AustrailinTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustrailinTraffic();
		a.greengo();
		a.flashyellow();
		a.redstop();
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implemenation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redsttop implemenation");
		
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow implemenation");
	}

}

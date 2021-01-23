package test;

public class childemo extends parentdemo {
	String name = "Testing";
	
	public childemo()
	{
		super();
		System.out.println("thisis my child class construcotr");
	}
	public void getstring()
	{
		super.getstring();
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

childemo cd = new childemo();
System.out.println(cd.name);
cd.getstring();


	}

}

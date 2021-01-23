package test;

public class Staticvar {
	
	String name;
	String address;
	String city;

	public Staticvar(String name,String address, String city) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.address=address;
		this.city=city;
	}
	
	public void getAddress()
	{
		System.out.println(address + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvar obj = new Staticvar("Bob","JP Nagar","Bangalore");
		Staticvar obj1 = new Staticvar("Manju","TR NAAag","Bombay");
	obj.getAddress();
	obj1.getAddress();

	}

}

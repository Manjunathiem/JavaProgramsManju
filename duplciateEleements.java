package test;

public class duplciateEleements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,3,4,23,3,4,5,6,7,4,5,6,78};
		
		for (int i =0; i<a.length;i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if((a[i]==a[j]) && (i!=j))
				{
					System.out.println("Duplciaet elements " + a[j]);
				}
			}
		}
		
		
		
		

	}

}


package test;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"manju", "manju","test","test","abc","abc","tst"};
		
		for (int i=0; i<arr.length;i++)
		{
			for (int j=i+1; j<arr.length;j++)
			{
				if((arr[i]==arr[j]) && (i!=j) )
				{
					System.out.println("duplicat elements " + arr[j]);
				}
			}
		}
		
		
		
		
	}

}

package test;

import java.util.ArrayList;

public class Arrayliststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] a = {"msnju", "test","manju","test","goog"};
		ArrayList<String> ar=new ArrayList<String>();
		
		for (int i=0; i<a.length; i++)
		{
			int k=0;
			if(!ar.contains(a[i]))
			{
				ar.add(a[i]);
				k++;
				
				for (int j=i+1; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
					
				}
				System.out.println(a[i]);
				System.out.println(k);
				
			}
			
		
		}

	}

}

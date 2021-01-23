package test;

public class interviewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{6,4,5},{2,8,9},{1,4,5}};
		int min = a[0][0];
		
		for (int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				if(a[i][j]>min)
				{
					min=a[i][j];
				}
			}
		}
		
		System.out.println(min);
		
		
		
		
	}

}

package Mypack;

public class Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5,6};
		int sum=0;
		/*for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
			
		}*/
		for(int x:A)
		{
			sum=sum+x;
		}
		System.out.println(sum);

	}

}

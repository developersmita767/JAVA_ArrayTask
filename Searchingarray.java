package Mypack;

import java.util.Scanner;

public class Searchingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a key");
		int key=sc.nextInt();
		for(int i=0;i<A.length;i++)
		{
			
			if(key==A[i]) {
				System.out.println("element are found at"+i);
				System.exit(0);
				
			}
		
		}
		System.out.println("key not found");

	}

}

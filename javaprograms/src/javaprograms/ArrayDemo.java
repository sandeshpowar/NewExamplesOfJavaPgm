package javaprograms;

import java.util.Arrays;

public class ArrayDemo 
	{

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
			System.out.println(arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		

		
		// TODO Auto-generated method stub

	}

}

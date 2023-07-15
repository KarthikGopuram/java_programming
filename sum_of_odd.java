//print the sum of odd numbers by deloitte

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int sum=0;
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]%2!=0){
		        sum=sum+arr[i];
		    }
		}
		System.out.print(sum);
	}
}

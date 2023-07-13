//right angle triangle n=3
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=0;i<=r;i++){
		    for(int k=0;k<=r-i;k++){
		        System.out.print("");
		    }
		    for(int j=0;j<=i;j++){
		   System.out.print("* ");
		}
		   System.out.println();
		}
	}
}

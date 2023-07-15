//printing the hash 1st and words next
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		String s="Move#Hash#to#Front";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='#'){
		      s1 = s1+s.charAt(i);
		    }else{
		        s2=s2+s.charAt(i);
		    }
		}
		System.out.print(s1+s2);
	}
}

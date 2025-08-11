package basics;

public class Palindrome {
	public static void main(String [] args) {
		int a =551;
		int ori = a;
		int rev = 0,rem;
		while(a!=0) {
			 rem=a%10;
			 rev=rev*10+rem;
			 a=a/10;
		}
		if(ori==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}
}

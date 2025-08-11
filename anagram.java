public class anagram {
	public static void main(String[] args) {
		  String str1 = "race";
		  String str2 = "care";
		  if (str1.length() != str2.length()) {
		       System.out.println("Not an anagram");
		       return;
		        }
		  int sum1 = 0;
		  int sum2 = 0;
		  for (int i = 0; i < str1.length(); i++) {
		      sum1 += (int) str1.charAt(i); 
		      sum2 += (int) str2.charAt(i); 
		     }
		     if (sum1 == sum2) {
		         System.out.println(" anagram");
		     }else {
		         System.out.println("not anagram ");
		        }
		    }
		}


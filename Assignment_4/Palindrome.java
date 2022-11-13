package iNeuronJavaPrograms.Assignment_4;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "2552";
		String temp = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			temp += s.charAt(i);
		}
		
		if(temp.equals(s)) {
			System.out.println(s + " is a palindrome.");
		}else {
			System.out.println(s + " is not a palindrome.");
		}
	}

}

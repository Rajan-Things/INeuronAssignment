package iNeuronJavaPrograms.Assignment_4;

import java.util.Scanner;

public class CheckAlphabets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int vowelCounts = 0;
		int consonantCounts = 0;
		int digitCounts = 0;
		int specialCharCounts = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				String s1 = (s.charAt(i)+"").toLowerCase();
				if(s1.charAt(0) == 'a' || s1.charAt(0) == 'e' || s1.charAt(0) == 'i' || s1.charAt(0) == 'o' || s1.charAt(0) == 'u') {
					vowelCounts += 1;
				}else {
					consonantCounts += 1;
				}
			}else if(Character.isDigit(s.charAt(i))){
				digitCounts += 1;
			}else {
				specialCharCounts += 1;
			}
		}
		System.out.println("Total Vowels: "+vowelCounts);
		System.out.println("Total Consonants: "+consonantCounts);
		System.out.println("Total Digits: "+digitCounts);
		System.out.println("Total Special Characters: "+specialCharCounts);
		sc.close();
	}

}

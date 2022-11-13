package iNeuronJavaPrograms.Assignment_4;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
//		Constraints:
//			You have enter only lower case alphabets (a to z) 
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int[] a = new int[26];
		int[] b = new int[26];
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) != ' ')
				a[s1.charAt(i)-97]++;
		}
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i) != ' ')
				b[s2.charAt(i)-97]++;
		}
		
		boolean isNotAnagram = false;
		for(int i=0; i<26; i++) {
			if(a[i] != b[i]) {
				isNotAnagram = true;
				break;
			}
		}
		
		if(isNotAnagram) {
			System.out.println("'"+s1+"' and '"+s2+"' are not anagram.");
		}else {
			System.out.println("'"+s1+"' and '"+s2+"' are anagram.");
		}
		
		sc.close();
	}

}

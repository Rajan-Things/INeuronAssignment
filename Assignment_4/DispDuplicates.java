package iNeuronJavaPrograms.Assignment_4;

import java.util.Scanner;

public class DispDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] ch = new int[127];
		
		String temp = "";
		
		for(int i=0; i<s.length(); i++) {
			ch[s.charAt(i)]++;
		}
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] > 1) {
				temp += ((char)(i) + " ");
				ch[i] = 1;
			}
		}
		System.out.println("Duplicates elements are: "+temp);
		sc.close();
	}

}

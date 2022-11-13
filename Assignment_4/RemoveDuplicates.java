package iNeuronJavaPrograms.Assignment_4;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] ch = new int[127];
		
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			if(ch[s.charAt(i)] == 0) {
				ch[s.charAt(i)]++;
				temp += s.charAt(i);
			}
		}
		System.out.println(temp);
		sc.close();
	}
}

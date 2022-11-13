package iNeuronJavaPrograms.Assignment_4;

import java.util.Scanner;

public class MaxOccurChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] ch = new int[127];
		for(int i=0; i<s.length(); i++) {
			ch[s.charAt(i)] += 1;
		}
		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] > max) {
				max = ch[i];
				idx = i;
			}
		}
		System.out.println("Maximum occurring character in "+s+" is "+(char)idx);
		sc.close();
	}
}

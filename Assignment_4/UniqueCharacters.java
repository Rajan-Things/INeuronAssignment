package iNeuronJavaPrograms.Assignment_4;

import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int[] ch = new int[127];
		
		for(int i=0; i<s.length(); i++) {
			ch[s.charAt(i)]+=1;
		}
		
		boolean isUnique = true;
		for(int i=0; i<ch.length; i++) {
			if(ch[i] > 1) {
				isUnique = false;
				break;
			}
		}
		
		if(isUnique) {
			System.out.println(s+ " contains unique characters.");
		}else {
			System.out.println(s+ " doesn't contain unique characters.");
		}
		sc.close();
	}

}

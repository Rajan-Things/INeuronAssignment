package iNeuronJavaPrograms.Assignment_2;

import java.util.*;

public class DuplicatesElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();		
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int[] t = new int[max+1];
		
		for(int i=0; i<n; i++) {
			t[arr[i]] += 1;
		}
		
		for(int i=0; i<t.length; i++) {
			if(t[i] > 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}

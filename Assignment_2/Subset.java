package Assignment_2;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of a first array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of a first array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the size of a second array: ");
		int m = sc.nextInt();
		int[] brr = new int[m];
		System.out.print("Enter the elements of a second array: ");
		for(int i=0; i<m; i++) {
			brr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int[] hash = new int[max+1];
		
		for(int i=0; i<n; i++) {
			hash[arr[i]] += 1;
		}
		
		int count = 0;
		for(int i=0; i<m; i++) {
			if(hash[brr[i]] == 1) {
				count += 1;
			}
		}
		
		if(count == m) {
			System.out.print("Second Array is a subset of First Array.");
		}else {
			System.out.print("Second Array is not a subset of First Array.");
		}
		sc.close();
	}

}

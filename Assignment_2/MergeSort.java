package iNeuronJavaPrograms.Assignment_2;

import java.util.Scanner;

public class MergeSort {
	public static void conquer(int[] arr, int st, int mid, int en) {
		int[] merged = new int[en - st + 1];
		int i = st;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= en) {
			if(arr[i] <= arr[j]) {
				merged[k++] = arr[i++];
			}else {
				merged[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			merged[k++] = arr[i++];
		}
		
		while(j <= en) {
			merged[k++] = arr[j++];
		}
		
		for(int m=0, n=st; m<merged.length; m++, n++) {
			arr[n] = merged[m]; 
		}
	}
	
	public static void divide(int[] arr, int st, int en) {
		if(st >= en) {
			return;
		}
		int mid = st + (en - st)/2;
		divide(arr, st, mid);
		divide(arr, mid+1, en);
		conquer(arr, st, mid, en);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();		
		}
		
		divide(arr, 0, n-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");		
		}
		sc.close();
	}

}

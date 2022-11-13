package iNeuronJavaPrograms.Assignment_4;


public class Pangram {

	public static void main(String[] args) {
		
		String s = "WALTZ BAD NYMPH FOR QUICK JIGS VEX";
		int[] a = new int[26];
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ')
				a[s.charAt(i)-65]++;
		}
		
		boolean isNotPangram = false;
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				isNotPangram = true;
				break;
			}
		}
		
		if(isNotPangram) {
			System.out.println(s+" is not a pangram");
		}else {
			System.out.println(s+" is a pangram");
		}
	}

}

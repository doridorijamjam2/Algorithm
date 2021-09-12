package Algorithm;

import java.util.Scanner;

public class A1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
	
		int[] arr = new int[N];
		
		double max = 0;
		double sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = (int) sc.nextDouble();
			if(arr[i] > max) {
				max = arr[i];
			}
						
		}
		for(int i=0; i<N; i++) {
			sum += max;
		}
		double avg = 0;
		
		avg = sum/N;
		System.out.println(avg);

	}

}

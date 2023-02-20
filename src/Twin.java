
//Problem:	160A - Twins

import java.util.Arrays;
import java.util.Scanner;
//
public class Twin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int total=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			total+=arr[i];
		}
		
		Arrays.sort(arr);
		int cnt=0,sum=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(sum>total/2) {
				break;
			}
			sum+=arr[i];
			cnt++;
		}
		System.out.println(cnt);
	}

}

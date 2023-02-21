import java.util.Scanner;

public class Game_With_Sticks_451A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		m=Math.min(m, n);
		if(m%2==0)
			System.out.println("Malvika");
		else
			System.out.println("Akshat");
	}

}

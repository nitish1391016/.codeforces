import java.util.Scanner;

public class Chat_room {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			String check="hello";
			int j=0;
			for(int i=0;i<str.length() && j<check.length();i++) {
				if(str.charAt(i)==check.charAt(j))
					j++;
			}
			if(j==5) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
	}
}

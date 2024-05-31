import java.util.*;

public class SmallestVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		input=input.toLowerCase();
		int a[]=new int[input.length()];
		
		 Arrays.fill(a, Integer.MAX_VALUE);
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isLetter(ch)) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				int ascii=(int)ch;
				a[i]=ascii;
			}
			}
		}
		
		int b=a[0];
		for(int i=1;i<input.length();i++) {
			if(a[i]<b) {
				b=a[i];
			}
		}
		
		char finalchar=(char)b;
		System.out.print(finalchar);

	}

}

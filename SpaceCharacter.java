import java.util.*;

public class SpaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int counts=0;
		int countc=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isLetter(ch)) {
				countc++;
			}
			
			else if(Character.isSpace(ch)) {
				counts++;
			}
			}
		System.out.println("space:"+counts);
		System.out.println("Characters:"+countc);
		}



		
}


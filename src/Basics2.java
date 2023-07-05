
public class Basics2 {

	public static void main(String[] args) {
		
		String s = "Hi welcome";
		String s1 = "Hi welcome";
		String s2 = new String("Welcome");
		
		String[] s3 = s.split(" ");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		
		for(int i=s2.length()-1; i>=0; i--) {
			System.out.println(s2.charAt(i));
		}

	}

}

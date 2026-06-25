package Elite02;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello";
		String s2= new String("Hello");
		String s3="Hello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s1=s1+" World";
		
		System.out.println(s1);
		String name="Nikhil";
		String nameRegex="[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String cell="9921341524";
		String cellRegex="[6-9][0-9]{9}";
		System.out.println(cell.matches(cellRegex));
		
		String email="nikhil96@gmail.com";
		String mailRegex="[a-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{3,}";
		System.out.println(email.matches(mailRegex));
	}
	
}

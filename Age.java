
public class Age {

	String  Age;
	String height;
	
	public Age(String c, String b) {
		
		Age=c;
		height=b;
	}

	public static void main(String[] args) {
		Age age1=new Age("19","5'4");
		System.out.println(age1.Age);

	}

}


public class Actor {
	String firstname;
	String lastname;

	public Actor (String first, String last) {

		firstname=first;
		lastname=last;
	}
	public static void main (String[]args) {
		Actor actor1=new Actor("Chris", "Evans");
		System.out.println(actor1.firstname);
	}


}



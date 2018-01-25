
public class Id {
String gpa;
String stdid;

public Id(String t, String i) {
	
	gpa=t;
	stdid=i;
}


	public static void main(String[] args) {
		Id id1=new Id("3.0", "234854");
		System.out.println(id1.stdid);

	}

}

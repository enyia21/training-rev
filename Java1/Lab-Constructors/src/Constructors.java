
public class Constructors {
	
	public Constructors() {
		System.out.println("Default constructor ran.");
	}
    public Constructors(int value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        //create instances here
    	Constructors c = new Constructors(5839);
    	
    	Constructors sNoArg = new Constructors();
    }
}
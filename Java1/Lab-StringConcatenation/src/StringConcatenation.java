
public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginning = "Hello";
		String end = " World";
		String combo = beginning + end;
		
		System.out.println(combo);
		
		long l = 230L;
		System.out.println("The value of l: " + l);
		
		boolean b = true;
		System.out.println(b + " is true");
		
		int x = 2;
		int y = 3;
		//Whatever is on the left hand side of the string determines whether concatenation of the sum occurs!
		System.out.println(x + y +" is the sum of x and y");
	}

}

package iostream;
import java.util.Scanner;

public class FileInputStreamFileOutputStream {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.println(word);
		//scan.nextLine will read all of the information until we reach a new line character
	}
}

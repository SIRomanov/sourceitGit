package HW4;
import java.util.Scanner;

public class wordcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите текст:");
		String text = sc.nextLine();
		sc.close();
		System.out.println(met(text));
	}
	static int met(String text){
		String[] textArr = text.split("[ ]");
		return textArr.length;
		    ///
	}
}
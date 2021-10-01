import java.util.Scanner;

/*
 * Scrivete un applicazione che calcoli se una stringa è palindroma o meno utilizzando un metodo ricorsivo.
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una parola ");
		String s = input.nextLine();
		boolean palindroma = calcoloPalindroma(s);
		if(palindroma) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		}
	}

	private static boolean calcoloPalindroma(String s) {
		int l = s.length();
		if(l <= 1) {
			return true;
		} else if(s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		} else {
			return calcoloPalindroma(s.substring(1, s.length() - 1)); 
		}
	}
}

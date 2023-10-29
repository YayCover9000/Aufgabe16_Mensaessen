import java.util.Scanner;
public class Aufgabe17_Mensaessen {
	public static void main(String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int auswahl = sc.nextInt();
			
			switch(auswahl) {
			case 1:
				System.out.println("Salami");
				break;
			case 2:
				System.out.println("Salat");
				break;
			case 3:
				System.out.println("Tomato");
				break;
			case 4:
				System.out.println("Bun");
				break;
			default:
				System.out.println("This is not the Way");
			}
		}
	}
}

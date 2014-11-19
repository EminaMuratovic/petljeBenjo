package petljeBenjo;

public class vjezbaa {
	public static void main(String[] args) {
		int prvi, drugi, suma;

		do {System.out.println("Prvi broj? ");
			prvi = TextIO.getInt();
			System.out.println("Drugi broj? ");
			drugi = TextIO.getInt();
			if (prvi == 0 && drugi == 0)
				break;
			else
				suma = prvi + drugi;
			System.out.println(suma);
			
		} while (prvi != 0 || drugi != 0);
	}
}

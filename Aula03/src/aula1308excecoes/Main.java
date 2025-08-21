package aula1308excecoes;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		
		
		try {
			x = 7 / 2;
		
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println(x);
		String texto = "1235";
		int y = 0;
		try {
		 y = Integer.parseInt(texto);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(y);
	
		String[] nomes = {"Ana", "Marcelo", "Caio"};
		try {
		System.out.println(nomes[5]);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass());
		}
	System.out.println("Continuou...");
	}
}

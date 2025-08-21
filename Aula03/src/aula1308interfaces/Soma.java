package aula1308interfaces;

public class Soma implements OperacaoMatematica {

	@Override
	public double executar(double a, double b) {
		return (a + b);
	}

	@Override
	public void descrever(double a, double b) {
        System.out.println("A soma de: " + a + " + " + b + " é: " + (a + b));
    }

}

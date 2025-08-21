package aula1308interfaces;

public class Subtracao implements OperacaoMatematica  {

	@Override
	public double executar(double a, double b) {
		return (a - b);
		
	}

	@Override
	public void descrever(double a, double b) {
		System.out.println("A subtração de: " + a + " + " + b + " é: " + (a - b));		
	}

}

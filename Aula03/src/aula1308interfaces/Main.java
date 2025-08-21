package aula1308interfaces;

public class Main {

	public static void main(String[] args) {
		Relatorio r = new Relatorio();
		r.imprimir();

		
		Retangulo re = new Retangulo();
		re.setBase(12.5);
		re.setAltura(3);
		re.imprimir();
		System.out.println("Area de re: " + re.calcularArea());
		System.out.println("Perimetro de re: " + re.calcularPerimetro());
		
		
		Soma s = new Soma();
		double a = 10;
		double b = 5;
        System.out.println("Resultado da soma: " + s.executar(a, b));
        
        s.descrever(a, b);
        
        Subtracao sub = new Subtracao();

        System.out.println("Resultado da subtração: " + sub.executar(7, 5));
        sub.descrever(a, b);
        
        Divisao div = new Divisao();

        System.out.println("Resultado da divisão: " + div.executar(9,0));
        div.descrever(a, b);
        
        Multiplicacao mult = new Multiplicacao();

        System.out.println("Resultado da multiplicação: " + mult.executar(39,4));
        mult.descrever(a, b);
	}

}

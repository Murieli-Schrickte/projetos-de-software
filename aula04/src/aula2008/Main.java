package aula2008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//Vetor comum (sem interface):
		System.out.println("VETOR: ");

		String[] nomes = new String[3];
		for(int i = 0; i< nomes.length; i++) {
			nomes[i] = "Nome";
			System.out.println("Nome: " + nomes[i]);
		}
		
		//Inicio do LIST:
		System.out.println("LIST: ");

		ArrayList<String> nomesList = new ArrayList<>();
		nomesList.add("Elizinha");
		nomesList.add("Myla");
		nomesList.add("Soobin");
		System.out.println(nomesList);
		nomesList.remove("Myla");
		System.out.println(nomesList);
		System.out.println(nomesList.get(0));
		System.out.println(nomesList.contains("Soobin"));
		
		//Inicio do SET:
		System.out.println("SET: ");

		HashSet<String> coisas = new HashSet<String>();
		coisas.add("Maçã");
		coisas.add("Celular");
		coisas.add("Express");
		coisas.add("Photocard do Soobin");
		coisas.add("Photocard do Taehyun");
		coisas.add("Photocard do Kai");
		coisas.add("Photocard do Yeonjun");
		coisas.add("Photocard do Beomgyu");
		coisas.add("Maçã");
		coisas.add("Photocard do Kai")
		System.out.println(coisas);
		System.out.println(coisas.contains("Celular"));

		//Inicio do MAP:
		System.out.println("MAP: ");
		
		Map<Integer, String> alunos = new HashMap<>();
		alunos.put(12, "Eli");
		alunos.put(32, "Mylena");
		alunos.put(18, "Elo");
		System.out.println(alunos);
		System.out.println(alunos.get(32));
		alunos.remove(32);
		System.out.println(alunos);


		System.out.println("     ");

		//Exercicio 01:
		System.out.println("Exe01: ");
		 ArrayList<Integer> num = new ArrayList<>();
	        Random rand = new Random();

	   
	        for (int i = 0; i < 10; i++) {
	            num.add(rand.nextInt(10) + 1);
	        }
	        System.out.println(num);
	        System.out.println("Números pares:");
	        for (int n : num) {
	            if (n % 2 == 0) {
	                System.out.println(n);
	            }
	        }
	    
	       System.out.println("     ");
	      //Exercicio 02:
	        System.out.println("Exe02: ");
			HashSet<String> names = new HashSet<String>();
			names.add("Fulano");
			names.add("Fulana");
			names.add("Cicrano");
			names.add("Cicrana");
			names.add("Dona");
			names.contains("Cicrano");
			names.remove("Cicrano");
			System.out.println(names);
			
			//Exercicio 03:
			System.out.println("Exe03: ");
			Map<String, Integer> produtos = new HashMap<>();
			produtos.put("Caneta", 2);
			produtos.put("Caneca", 30);
			produtos.put("Tesoura", 5);
			produtos.put("Notebook", 2800);
			produtos.put("Meia", 20);
			
			for (Map.Entry<String, Integer> entrada : produtos.entrySet()) {
				if(entrada.getValue()>10) {
					System.out.println(entrada.getKey());
			}
			}
		       System.out.println("     ");

			//Exercicio 04:
		   	System.out.println("Exe04: ");
		       ArrayList<String> nomesdnv = new ArrayList<>();
		        nomesdnv.add("Andre");
		        nomesdnv.add("Anne");
		        nomesdnv.add("Elizinha");
		        nomesdnv.add("Soobin");
		        System.out.println(nomesdnv);
		        ArrayList<String> remover = new ArrayList<>();

		        for (int i = 0; i < nomesdnv.size(); i++) {
		            if (nomesdnv.get(i).startsWith("A")) {
		                remover.add(nomesdnv.get(i));
		            }
		        }

		        nomesdnv.removeAll(remover);

		        System.out.println("Nomes sem A: " + nomesdnv);
			}
		}

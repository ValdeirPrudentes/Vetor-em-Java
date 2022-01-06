package controle;

import java.util.Vector;

public class Programa {
	public static void main(String[] args) {
		Vector listaNomes = new Vector();
		
		listaNomes.add("Jose");
		listaNomes.add("Maria");
		listaNomes.add("Dalira");
		listaNomes.add("Ralf");
		listaNomes.add("Maria");
		listaNomes.add("Gerson");
		
		System.out.println("Quantidade de nomes: " + 
				listaNomes.size());
		System.out.println("Primeiro nome: " + 
				listaNomes.firstElement());
		System.out.println("�ltimo nome: " + 
				listaNomes.lastElement());
		System.out.println("Terceiro nome: " +
				listaNomes.get(2));
		System.out.println("Primeira posi��o de Maria: " +
				listaNomes.indexOf("Maria"));
		System.out.println("�ltima posi��o de Maria: " +
				listaNomes.lastIndexOf("Maria"));
		
		if (listaNomes.contains("Gerson"))
			System.out.println("Gerson est� na cole��o");
		else
			System.out.println("Gerson n�o est� na cole��o");
		
		if (listaNomes.contains("Jo�o"))
			System.out.println("Jo�o est� na cole��o");
		else
			System.out.println("Jo�o n�o est� na cole��o");
		
		System.out.println("");
		System.out.println(listaNomes);
		
		listaNomes.add(4, "Augusto");
		System.out.println(listaNomes);
		
		listaNomes.setElementAt("Marco", 3);
		System.out.println(listaNomes);
		
		listaNomes.remove("Augusto");
		System.out.println(listaNomes);
	}
}

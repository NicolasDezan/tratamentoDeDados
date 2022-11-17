package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaMedianaDesvPad {

	public static void main(String[] args) {
		
		List<Float> dados = new ArrayList();
	    System.out.println("Insira cada um de seus valores obtidos.");
	    System.out.println("Para calcular a média, mediana e desvio padrão do conjunto de dados, insira qualquer caractere:");
	    Scanner teclado = new Scanner(System.in);
	    
	    dados.add (Float.parseFloat(teclado.nextLine()));
	    boolean verdade = true;
	    while (verdade) {
		try {
			Float numero = Float.parseFloat(teclado.nextLine());
			dados.add(numero);
		} catch (NumberFormatException ex) { verdade = false; }
	    } 
	    System.out.println("O conjunto de valores inseridos é:" + dados);

	    calcularMedia(dados);
	    }
        
	 public static void calcularMedia(List<Float> dados) {
	    float r = 0.0f;
	    for (Float dado : dados) {
	    	r += dado;
	    }
	    float media = r/dados.size();
	    
	    System.out.println("A média dos seus valores é " + media);
	    
	    float d = 0.0f;
	    for (Float n : dados) {
	    	d += Math.pow(n-media, 2);
	    }
	    float var = d/(dados.size()-1);
	    float desvpad = (float) Math.sqrt(var);
	    
	    System.out.println("O desvio padrão de seus valores é " + desvpad);
	    
	    /* Para calcular mediana existe duas possibilidades:
	     * 1) dados.size() -> impar -> O resto da divisão desse numero por 2 é 1 -> impar se 
	     * dados.size() %2  = 1 
	     * 
	     * 2) dados.size() -> par -> o resto é 0
	     * 
	     * 
	     * 
	     */
}

	

}

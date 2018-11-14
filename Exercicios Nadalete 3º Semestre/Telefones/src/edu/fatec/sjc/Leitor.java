package edu.fatec.sjc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitor {
	  public static void main(String args[]){
		 try {
			 FileInputStream arquivo = new FileInputStream("telefones.txt");
			 InputStreamReader input = new InputStreamReader(arquivo);
			 BufferedReader br = new BufferedReader(input);
			 String Linha;
			 
			 do {
				 Linha = br.readLine();
				 if (Linha != null){
					String[] palavra = Linha.split(" ");
					
					for (int i=0;i<palavra.length; i++) {
						System.out.println(palavra[i]);
					}
					
				 }
			 }while (Linha != null);
			 
		 }
		 catch(Exception e) {
			 System.out.println("Erro ao ler arquivo");
		 }
	}

	
}

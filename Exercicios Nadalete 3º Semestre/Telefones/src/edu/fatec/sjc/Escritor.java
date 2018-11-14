package edu.fatec.sjc;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Escritor {
	public static void main(String args[]) {
		Leitor leitor;
		try {
			FileOutputStream arquivo = new FileOutputStream("teste.txt");
			PrintWriter pr = new PrintWriter(arquivo);
			
			//pr.println(leitor.palavra);
			
		
			pr.close();
			arquivo.close();
		}
		catch(Exception e) {
			System.out.println("Erro ao Escrever o arquivo");
		}
	}
 

}


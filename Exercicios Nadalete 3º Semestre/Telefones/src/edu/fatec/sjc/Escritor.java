package edu.fatec.sjc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {
 
  public static void main(String args[]) throws IOException) {
	  FileReader f = new FileReader("Endeço");
	  BufferedReader in = new BufferedReader(f);
	  String linha = in.readLine();
	  while (linha != null){
		System.out.println(linha);
		linha = in.readLine();
	  }
	  in.close();
}


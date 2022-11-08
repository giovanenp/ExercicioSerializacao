package br.com.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NomeCompleto {
  static String nome[] = new String[10];
  static String sobreNome[] = new String[10];

  public static void lerNome(String path) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new FileReader(path));
    for (int i = 0; i < 10; i++) {
      nome[i] = bufferReader.readLine();
    }
    bufferReader.close();
  }

  public static void lerSobreNome(String path) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new FileReader(path));
    for (int i = 0; i < 10; i++) {
      sobreNome[i] = bufferReader.readLine();
    }
    bufferReader.close();
  }

  public static void unirNome() {
    for (int i = 0; i < 10; i++) {
      System.out.println(nome[i] + " " + sobreNome[i]);
    }
  }
}

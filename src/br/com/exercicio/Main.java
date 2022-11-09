package br.com.exercicio;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "./src/br/com/exercicio/ArquivoNomes.txt";
    NomeCompleto.lerNome(path);

    path = "./src/br/com/exercicio/SobreNomes.txt";
    NomeCompleto.lerSobreNome(path);

    path = "./src/br/com/exercicio/NomeSobrenome.txt";
    NomeCompleto.escritor(path);
    NomeCompleto.lerNomeCompleto(path);
  }
}

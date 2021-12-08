package br.senai.arquivo.araylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	/*
	Cria o arquivo quando esse não exitir grava dados
	no arquivo.
	*/
	public boolean escrever(String caminho, String texto) {
		
		try {
			
			//OBJETO QUE REPRESENTA O ARQUIVO
			FileWriter arquivo = new FileWriter(caminho);
			
			//OBJETO QUE REPRESENTA A MANIPULAÇÃO (ESCREVER) DOS DADOS DO ARQUIVO
			PrintWriter escreverArq = new PrintWriter(arquivo);
			
			escreverArq.append(texto);
			escreverArq.close();
			return true;
			
		}catch(IOException e){
			
			System.out.println("ERRO: " + e.getMessage());
			return false;
			
			
		}
		
	}
	
	public String ler(String caminho){
		
		String conteudo="";
		
		try {
			
			//REPRESENTA O ARQUIVO EM MODO DE LEITURA
			FileReader arquivo = new FileReader(caminho);
			
			//REPRESENTA O DADO DE LEITURA NA MÉMORIA PRINCIPAL DO PROGRAMA.
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha = "";
			
			linha = lerArquivo.readLine();
			while(linha != null) {
				
				conteudo += linha + "\n";
				linha = lerArquivo.readLine();
				
			}
			
			arquivo.close();
			return conteudo;			

		}catch(IOException e){
			
			System.out.println("ERRO: " + e.getMessage());
			return "";
			
		}
		
	}
	
}

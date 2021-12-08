package br.senai.arquivo.araylist;

import java.util.ArrayList;

public class DadosContato {

	// ATRIBUTOS

	Contato contato = new Contato();
	ArrayList<Contato> contatos = new ArrayList<Contato>();

	// M�TODOS

	public void cadastrarContato(Contato c) {

		contatos.add(c);

	}

	public ArrayList<Contato> listarContatos() {

		return contatos;
	}

	public int contarContatos() {

		return contatos.size();
	}

}

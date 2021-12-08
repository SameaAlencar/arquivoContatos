package br.senai.arquivo.araylist;

public class App {

	public static void main(String[] args) {
		
	Arquivo objArquivo = new Arquivo();
	String caminho = "C:\\Users\\21276435\\Desktop\\CONTATO\\contatos.txt";
	
	DadosContato objDadosContato = new DadosContato();
	
	Contato objContato = new Contato("Ana", "ana@gmail.com", "1111-2222", "Jandira");
	Contato objContato2 = new Contato("Maria", "maria@gmail.com", "3333-4444", "Barueri");
	Contato objContato3 = new Contato("João", "joao@gmail.com", "5555-6666", "Osasco");
	Contato objContato4 = new Contato("José", "jose@gmail.com", "7777-8888", "Itapevi");
	
	objDadosContato.cadastrarContato(objContato);
	objDadosContato.cadastrarContato(objContato2);
	objDadosContato.cadastrarContato(objContato3);
	objDadosContato.cadastrarContato(objContato4);
	
	String texto = "";
	
	for(Contato c : objDadosContato.listarContatos()) {
		
		
	 texto += c.getNome() + "; " + c.getEmail() + "; " +
	 c.getTelefone() + "; " + c.getCidade() + "\n";
		//System.out.println("NOME: " + c.getNome() + " E-MAIL:0 "+ c.getEmail() + 
			//	" TELEFONE: " + c.getTelefone() + " CIDADE: " + c.getCidade());
	}
	
	//System.out.println(texto);
	objArquivo.escrever(caminho, texto);
	
	
	
	
	
	}

}

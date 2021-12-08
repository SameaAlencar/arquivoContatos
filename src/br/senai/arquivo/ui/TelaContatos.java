package br.senai.arquivo.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.arquivo.araylist.Arquivo;
import br.senai.arquivo.araylist.Contato;
import br.senai.arquivo.araylist.DadosContato;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCidade;

	// Atributos de instância de objetos

	private Arquivo objArquivo;
	private Contato objContato;
	private DadosContato objDadosContato;
	private String caminho;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContatos frame = new TelaContatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaContatos() {
		setBackground(new Color(255, 0, 0));

		// Criação dos objetos das classes

		objContato = new Contato();
		objArquivo = new Arquivo();
		objDadosContato = new DadosContato();
		
		caminho = "C:\\Users\\21276435\\Desktop\\CONTATO\\contatos.txt";
		
		//Exibe o total de contatos cadastrados
		
		System.out.println("Total de contatos " + objDadosContato.contarContatos());
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastro = new JLabel("Cadastro de contatos: ");
		lblCadastro.setForeground(Color.RED);
		lblCadastro.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCadastro.setBounds(26, 22, 229, 27);
		contentPane.add(lblCadastro);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNome.setBounds(26, 77, 46, 14);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(26, 102, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblTelefone = new JLabel(" Telefone:");
		lblTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTelefone.setBounds(10, 127, 62, 14);
		contentPane.add(lblTelefone);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCidade.setBounds(26, 152, 46, 14);
		contentPane.add(lblCidade);

		txtNome = new JTextField();
		txtNome.setBounds(79, 75, 152, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(79, 102, 152, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(79, 125, 152, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(79, 152, 152, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Ação do botão cadastrar

				// RECEBER OS DADOS DIGITADOS NO OBJETO objContato:
				objContato.setNome(txtNome.getText());
				objContato.setEmail(txtEmail.getText());
				objContato.setTelefone(txtTelefone.getText());
				objContato.setCidade(txtCidade.getText());

				// Tratando os dados para a inserção no arquivo de texto:

				String texto = "";
				texto = objContato.getNome() + "; " + objContato.getEmail() + "; " + objContato.getTelefone() + "; "
						+ objContato.getCidade();

				//System.out.println(texto);
				objArquivo.escrever(caminho, texto);
				

			}
		});
		btnCadastrar.setForeground(new Color(0, 128, 0));
		btnCadastrar.setBounds(44, 193, 105, 41);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("Total de contatos: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 272, 152, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0000");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(161, 273, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
}

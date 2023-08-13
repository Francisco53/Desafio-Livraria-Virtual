package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Eletronico;
import model.Impresso;
import model.Venda;

public class LivrariaVirtual {

	public Scanner sc;

	private static final int MAX_IMPRESSOS = 10;
	private static final int MAX_ELETRONICOS = 20;
	private static final int MAX_VENDAS = 50;

	private int numImpressos = 0;
	private int numEletronicos = 0;
	private int numVendas = 0;

	private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];
	private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];
	private Venda[] vendas = new Venda[MAX_VENDAS];

	public LivrariaVirtual() {
		sc = new Scanner(System.in);
	}

	public int getNumImpressos() {
		return numImpressos;
	}

	public void setNumImpressos(int numImpressos) {
		if (numImpressos > 0 && numImpressos <= MAX_IMPRESSOS) {
			this.numImpressos = numImpressos;
		} else {
			throw new IllegalArgumentException("Quantidade inválida!");
		}
	}

	public int getNumEletronicos() {
		return numEletronicos;
	}

	public void setNumEletronicos(int numEletronicos) {
		if (numEletronicos > 0 && numEletronicos <= MAX_ELETRONICOS) {
			this.numEletronicos = numEletronicos;
		} else {
			throw new IllegalArgumentException("Quantidade inválida!");
		}
	}

	public int getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(int numVendas) {
		if (numVendas > 0 && numVendas <= MAX_VENDAS) {
			this.numVendas = numVendas;
		} else {
			throw new IllegalArgumentException("Quantidade inválida!");
		}
	}

	public Impresso[] getImpressos() {
		return impressos;
	}

	public void adicionarLivroImpresso(Impresso livro) {
		if (livro != null && getNumImpressos() < MAX_IMPRESSOS) {
			impressos[getNumImpressos()] = livro;
			setNumImpressos(getNumImpressos() + 1);
			System.out.println("Livro impresso cadastrado.");
		} else {
			System.out.println("Erro ao cadastrar livro.");
		}
	}

	public Eletronico[] getEletronicos() {
		return eletronicos;
	}

	public void adicionarLivroEletronico(Eletronico livro) {
		if (livro != null && getNumEletronicos() < MAX_ELETRONICOS) {
			eletronicos[getNumEletronicos()] = livro;
			setNumEletronicos(getNumEletronicos() + 1);
			System.out.println("Livro eletrônico cadastrado.");
		} else {
			System.out.println("Erro ao cadastrar livro eletrônico.");
		}
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public void cadastrarLivro() {
		try {
			int option;
			while (true) {
				System.out.println("Informa o tipo de livro a ser cadastrado:");
				System.out.println("[1] Impresso");
				System.out.println("[2] Eletrônico");
				System.out.println("[3] Ambos");
				System.out.println("[4] Voltar");
				option = sc.nextInt();
				sc.nextLine();

				switch (option) {
				case 1: {
					cadastrarLivroImpresso();
					break;
				}
				case 2: {
					cadastrarLivroEletronico();
					break;
				}
				case 3: {
					cadastrarLivroImpresso();
					cadastrarLivroEletronico();
					break;
				}
				case 4: {
					return;
				}
				default: {
					System.out.println("Entrada inválida. Digita um valor numérico correspondente.");
				}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Digita um valor numérico correspondente.");
		}
	}

	public void cadastrarLivroImpresso() {
		if (numImpressos == MAX_IMPRESSOS) {
			System.out.println("Atingida a quantidade máxima de cadastro de livros impressos!");
		}
		try {
			String titulo;
			String autores;
			String editora;
			float preco;
			float frete;
			int estoque;

			System.out.println("*** Dados do livro impresso ***");
			System.out.print("Título: ");
			titulo = sc.nextLine();
			System.out.print("Autores: ");
			autores = sc.nextLine();
			System.out.print("Editora: ");
			editora = sc.nextLine();
			System.out.print("Preço: ");
			preco = sc.nextFloat();
			sc.nextLine();
			System.out.print("Frete: ");
			frete = sc.nextFloat();
			sc.nextLine();
			System.out.print("Estoque: ");
			estoque = sc.nextInt();
			sc.nextLine();

			Impresso impresso = new Impresso(titulo, autores, editora, preco, frete, estoque);
			adicionarLivroImpresso(impresso);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Digita um valor numérico correspondente.");
		}
	}

	public void cadastrarLivroEletronico() {
		if (numEletronicos == MAX_ELETRONICOS) {
			System.out.println("Atingida a quantidade máxima de cadastro de livros eletrônicos!");
			return;
		}
		try {
			String titulo;
			String autores;
			String editora;
			float preco;
			int tamanho;

			System.out.println("*** Dados do livro eletrônico ***");
			System.out.print("Título: ");
			titulo = sc.nextLine();
			System.out.print("Autores: ");
			autores = sc.nextLine();
			System.out.print("Editora: ");
			editora = sc.nextLine();
			System.out.print("Preço: ");
			preco = sc.nextFloat();
			sc.nextLine();
			System.out.print("Tamanho: ");
			tamanho = sc.nextInt();
			sc.nextLine();

			Eletronico eletronico = new Eletronico(titulo, autores, editora, preco, tamanho);
			adicionarLivroEletronico(eletronico);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Digita um valor numérico correspondente.");
		}
	}

	public void realizarVenda() {

	}

	public void listarLivrosImpressos() {

	}

	public void listarLivrosEletronicos() {

	}

	public void listarLivros() {

	}

	public void listarVendas() {

	}

	public static void main(String[] args) {

		LivrariaVirtual livraria = new LivrariaVirtual();
		livraria.cadastrarLivro();

		livraria.sc.close();
	}
}

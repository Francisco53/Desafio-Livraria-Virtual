package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private static int numVendas = 0;
	private int numero;
	private String cliente;
	private float valor;
	List<Livro> livros = new ArrayList<Livro>();

	public Venda() {
	}

	public Venda(String cliente, float valor) {
		this.cliente = cliente;
		this.valor = valor;
		numVendas++;
	}

	public int getNumVendas() {
		return numVendas;
	}

	public int getNumero() {
		return numero = getNumVendas();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void addLivro(Livro livro) {
		livros.add(livro);
	}

	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro na venda.");
		} else {
			System.out.println("Livros na venda:");
			for (int i = 0; i < livros.size(); i++) {
				Livro livro = livros.get(i);
				System.out.println("Livro " + (i + 1) + ": " + livro.getTitulo());
			}
		}
	}
}

package desafiolivraria;

import java.util.ArrayList;
import java.util.List;


public class Venda {
    
    private static int numVendas = 0;
    private int numero;
    private String cliente;
    private float valor;
    List<Livro> listaLivros = new ArrayList<>();

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

    public List<Livro> getListaLivros() {
        return listaLivros;
    }
    
    
    public void addLivro(Livro livro) {
        listaLivros.add(livro);
    }
    
    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("Nenhum livro na venda.");
        } else {
            System.out.println("Livros na venda:");
            for (int i = 0; i < listaLivros.size(); i++) {
                Livro livro = listaLivros.get(i);
                System.out.println("Livro " + (i + 1) + ": " + livro.getTitulo());
            }
        }
    }
    
    
}

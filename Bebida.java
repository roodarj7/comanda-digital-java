package ComandaDigital;

public class Bebida extends ItemCardapio {

    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Bebida: " + this.getNome() + ", Preço: " + this.getPreco());
    }
}


package ComandaDigital;


public abstract class ItemCardapio {
    private String nome;
    private double preco;

    public ItemCardapio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return this.preco; }

    public void imprimirDetalhes() {
        System.out.println("Item: " + this.nome + ", Preço: R$ " + this.preco);
    }
}
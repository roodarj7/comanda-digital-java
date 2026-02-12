package ComandaDigital;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private int numMesa;
    private List<ItemCardapio> itens;

    public Pedido(int numMesa) {
        this.numMesa = numMesa;
        this.itens = new ArrayList<>();
  
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemCardapio item : this.itens) {
            total += item.getPreco();
        }
        System.out.println("Total do pedido: R$ " + total);
        return total;
    }

    public void adicionarItem(ItemCardapio item) {
        this.itens.add(item);
    }

    public void removerItem(ItemCardapio item) {
        this.itens.remove(item);
    }

    public int getNumMesa() { return this.numMesa; }
    public List<ItemCardapio> getItens() { return this.itens; }
}

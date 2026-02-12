package ComandaDigital;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<Pedido> comandasNaFila = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        this.comandasNaFila.add(pedido);
    }

    public void telaPedidos() {
        if (comandasNaFila.isEmpty()) {
            System.out.println("Nenhum pedido na fila.");
        } else {
                System.out.println("Pedidos na fila:");
            for (Pedido pedido : comandasNaFila) {
                System.out.println("Mesa: " + pedido.getNumMesa() + ", Itens: " + pedido.getItens().size());
            for (ItemCardapio item : pedido.getItens()) 
                if (item instanceof Prato) {
                    Prato prato = (Prato) item;
                    System.out.println(" - " + prato.getNome() + ": " + prato.getDescricao() + ", R$ " + prato.getPreco());
                } else if (item instanceof Bebida) {
                    Bebida bebida = (Bebida) item;
                    System.out.println(" - " + bebida.getNome() + ": R$ " + bebida.getPreco());
                }   
            }
        }
    }

    public void darBaixaPedido(int numMesa) {
            Pedido pedidoParaRemover = null;
        for (Pedido pedido : comandasNaFila) {
            if (pedido.getNumMesa() == numMesa) {
                pedidoParaRemover = pedido;
                break;
            }
        }
        if (pedidoParaRemover != null) {
            this.comandasNaFila.remove(pedidoParaRemover);
            System.out.println("Pedido da mesa " + numMesa + " finalizado.");
        }
    }
}
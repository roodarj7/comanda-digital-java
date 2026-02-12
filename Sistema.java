package ComandaDigital;

public class Sistema {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha();

        Pedido pedido1 = new Pedido(1);
        pedido1.adicionarItem(new Prato("Hambúrguer", 25.00, "Carne, queijo, alface, tomate"));
        pedido1.adicionarItem(new Bebida("Refrigerante", 5.00));

        cozinha.adicionarPedido(pedido1);
        
        cozinha.telaPedidos();

        pedido1.calcularTotal();

        cozinha.darBaixaPedido(1);
        cozinha.telaPedidos();
    }
    
}

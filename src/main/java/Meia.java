public class Meia extends PedidoDecorator{

    public Meia(Pedido pedido){
        super(pedido);
    }

    public double getValorPromocao() {
        return 5.00;
    }

    public String getTipoItem() {
        return "Meia";
    }
}

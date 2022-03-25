public class Tenis extends PedidoDecorator{

    public Tenis(Pedido pedido){
        super(pedido);
    }

    public double getValorPromocao(){
        return 10.00;
    }

    public String getTipoItem(){
        return "Tenis";
    }
}

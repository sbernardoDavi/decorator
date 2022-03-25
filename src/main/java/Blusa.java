public class Blusa extends PedidoDecorator{

    public Blusa(Pedido pedido){
        super(pedido);
    }

    public double getValorPromocao(){
        return 20.00;
    }

    public String getTipoItem(){
        return "Blusa";
    }

}

public class PedidoPromocao implements Pedido{

    public double valor;

    public PedidoPromocao(){

    }

    public PedidoPromocao(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public String getItem(){
        return "Promoção";
    }
}

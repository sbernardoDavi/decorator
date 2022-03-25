public abstract class PedidoDecorator implements Pedido {

    private Pedido pedido;
    public String item;

    public PedidoDecorator(Pedido pedido){
        this.pedido = pedido;
    }

    public Pedido getPedido(){
        return pedido;
    }

    public void setPedido(){
        this.pedido = pedido;
    }

    public abstract double getValorPromocao();

    public double getValor(){
        return this.pedido.getValor() - (this.getValorPromocao());
    }

    public abstract String getTipoItem();

    public String getItem(){
        return this.pedido.getItem() + "/" + this.getTipoItem();
    }

    public void setItem(String item){
        this.item = item;
    }
}

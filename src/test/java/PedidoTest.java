import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void deveRetornarValorPedido(){
        Pedido pedido = new PedidoPromocao(10.00);

        assertEquals(10.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoTenis(){
        Pedido pedido = new Tenis(new PedidoPromocao(300.00));

        assertEquals(290.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoBlusa(){
        Pedido pedido = new Blusa(new PedidoPromocao(100.00));

        assertEquals(80.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoMeia(){
        Pedido pedido = new Meia(new PedidoPromocao(40.00));

        assertEquals(35.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoBlusaMaisTenis(){
        Pedido pedido = new Blusa(new Tenis(new PedidoPromocao(500.00)));

        assertEquals(470.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoBlusaMaisMeia(){
        Pedido pedido = new Blusa(new Meia(new PedidoPromocao(180.00)));

        assertEquals(155.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoMeiaMaisTenis(){
        Pedido pedido = new Meia(new Tenis(new PedidoPromocao(250.00)));

        assertEquals(235.00, pedido.getValor());
    }

    @Test
    public void deveRetornarValorPedidoMeiaMaisTenisMaisBlusa(){
        Pedido pedido = new Meia(new Tenis(new Blusa(new PedidoPromocao(500.00))));

        assertEquals(465.00, pedido.getValor());
    }

    @Test
    public void deveRetornarItemPedidoPromocao(){
        Pedido pedido = new PedidoPromocao();

        assertEquals("Promoção", pedido.getItem());
    }

    @Test
    public void deveRetornarItemPromocaoBlusa(){
        Pedido pedido = new Blusa(new PedidoPromocao());

        assertEquals("Promoção/Blusa", pedido.getItem());
    }

    @Test
    public void deveRetornarItemPromocaoMeia(){
        Pedido pedido = new Meia(new PedidoPromocao());

        assertEquals("Promoção/Meia", pedido.getItem());

    }

    @Test
    public void deveRetornarItemPromocaoTenis(){
        Pedido pedido = new Tenis(new PedidoPromocao());

        assertEquals("Promoção/Tenis", pedido.getItem());
    }

    @Test
    public void devRetornarItemPromocaoBlusaMeia(){
        Pedido pedido = new Blusa(new Meia(new PedidoPromocao()));

        assertEquals("Promoção/Meia/Blusa", pedido.getItem());
    }

    @Test
    public void deveRetornarItemPromocaoBlusaTenis(){
        Pedido pedido = new Blusa(new Tenis(new PedidoPromocao()));

        assertEquals("Promoção/Tenis/Blusa", pedido.getItem());
    }

    @Test
    public void deveRetornarItemPromocaoMeiaTenis(){
        Pedido pedido = new Meia(new Tenis(new PedidoPromocao()));

        assertEquals("Promoção/Tenis/Meia", pedido.getItem());

    }

    @Test
    public void  deveRetornarItemPromocaoBlusaMeiaTenis(){
        Pedido pedido = new Blusa(new Meia(new Tenis(new PedidoPromocao())));

        assertEquals("Promoção/Tenis/Meia/Blusa", pedido.getItem());
    }

}


import org.junit.Test;
import static org.junit.Assert.*;


public class CarroStateTest {
    @Test
    public void teste(){
        Carro carro = new Carro();
//        carro.potencia();
//        carro.seta();
//        carro.desligar();
//        carro.ligar();
//        carro.ligar();
//        carro.desligar();
//        carro.desligar();
//        carro.seta();
//        carro.desligar();
//        carro.desligar();
//        carro.desligar();

        assertEquals("Mais potência", carro.estado.ativarTurbo());


    }

    @Test
    public void testeSeta(){
        Carro carro = new Carro();

        carro.seta();
        assertEquals("seta", carro.estado.seta());

    }


@Test
public void testeDesligar(){
        Carro carro = new Carro();
        assertEquals("Desligado",carro.estado.desligarCarro() );

        }
 }


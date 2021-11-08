import org.junit.Test;


public class CarroStateTest {

    @Test
    public void teste(){
        Carro carro = new Carro();
        carro.potencia();
        carro.seta();
        carro.desligar();
        carro.ligar();
        carro.ligar();
        carro.desligar();
        carro.desligar();
        carro.seta();
        carro.desligar();
        carro.desligar();
        carro.desligar();
    }
}


public class Carro {
    protected CarroState estado;

    public Carro() {
        estado = new CarroSeta();
    }

    public void potencia() {
        estado = estado.ativarTurbo();
    }

    public void ligar() {
        estado = estado.botaoLigar();
    }

    public void seta() {
        estado = estado.seta();
    }

    public void desligar() {
        estado = estado.desligarCarro();
    }
}
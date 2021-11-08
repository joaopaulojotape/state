public class CarroTurbo implements CarroState {

    @Override
    public CarroState ativarTurbo() {
        System.out.println("Mais potência");
        return this;
    }

    @Override
    public CarroState botaoLigar() {
        System.out.println("Liga Carro");
        return new CarroLigado();
    }

    @Override
    public CarroState seta() {
        System.out.println("seta");
        return this;
    }

    @Override
    public CarroState desligarCarro() {
        System.out.println("Desligar apenas carro");
        return new CarroFarol();
    }

}
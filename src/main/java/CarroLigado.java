public class CarroLigado implements CarroState {

    @Override
    public CarroState ativarTurbo() {
        System.out.println("Mais potência");
        return this;
    }

    @Override
    public CarroState botaoLigar() {
        System.out.println("Carro Ligado com turbo");
        return this;
    }

    @Override
    public CarroState seta() {
        System.out.println("seta");
        return new CarroTurbo();
    }

    @Override
    public CarroState desligarCarro() {
        System.out.println("Desligar apenas carro");
        return new CarroFarol();
    }

}
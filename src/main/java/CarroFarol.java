public class CarroFarol implements CarroState {

    @Override
    public CarroState ativarTurbo() {
        System.out.println("Mais potência");
        return this;
    }

    @Override
    public CarroState botaoLigar() {
        System.out.println("Carro ligado");
        return new CarroLigado();
    }

    @Override
    public CarroState seta() {
        System.out.println("seta");
        return new CarroTurbo();
    }

    @Override
    public CarroState desligarCarro() {
        System.out.println("Mario pequeno");
        return new CarroSeta();
    }

}
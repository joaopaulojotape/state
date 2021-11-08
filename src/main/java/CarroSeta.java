public class CarroSeta implements CarroState {

    @Override
    public CarroState ativarTurbo() {
        System.out.println("Mais potência");
        return new CarroFarol();
    }

    @Override
    public CarroState botaoLigar() {
        System.out.println("Carro Ligado com turbo");
        return new CarroLigado();
    }

    @Override
    public CarroState seta() {
        System.out.println("Farol e seta");
        return new CarroTurbo();
    }

    @Override
    public CarroState desligarCarro() {
        System.out.println("Desligado");
        return new CarroDesligado();
    }

}
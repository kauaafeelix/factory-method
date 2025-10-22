package app;

public class LogisticaUrbana extends Logistica {
    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}

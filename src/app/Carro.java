package app;

public class Carro implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entrega realizada por carro");
    }
}

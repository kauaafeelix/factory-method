package app;

public abstract class Logistica {

    // Factory Method
    public abstract Transporte criarTransporte();

    // Método que usa o objeto criado
    public void planejarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar(); // quem for subclasse decide o que criar
    }
}

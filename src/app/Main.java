package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logistica logistica1 = new LogisticaRodoviaria();
        logistica1.planejarEntrega();

        Logistica logistica2 = new LogisticaUrbana();
        logistica2.planejarEntrega();


    }
}
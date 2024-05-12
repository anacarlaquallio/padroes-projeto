package observer;

public class Main {
    public static void main(String[] args) {
        // Criando uma sonda espacial
        SpaceProbe voyager1 = new SpaceProbe("Voyager 1", "Outer Space");

        // Criando uma agência espacial
        SpaceAgency nasa = new SpaceAgency("NASA");

        // Registrando a agência espacial como observadora da sonda espacial
        voyager1.registerObserver(nasa);

        // Simulando o movimento da sonda espacial
        voyager1.move("Interstellar Space");
    }
}

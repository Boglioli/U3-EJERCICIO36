public class Main {
    public static void main(String[] args) {
        Bombero bombero = new Bombero("ABC123", "estación central", 5000, 30.5);
        Policial policial = new Policial("XYZ789", "comisaría norte", 4, "Blindaje Nivel 3");
        Ambulancia ambulancia = new Ambulancia("DEF456", "hospital general", 10, 2);

        System.out.println("información del vehículo de bomberos:");
        bombero.mostrarInformacion();
        bombero.activarAlerta();

        System.out.println("\ninformación del vehículo policial:");
        policial.mostrarInformacion();
        policial.activarAlerta();

        System.out.println("\ninformación del vehículo de ambulancia:");
        ambulancia.mostrarInformacion();
        ambulancia.activarAlerta();
    }
}
public class Bombero extends VehiculoEmergencia {
    private int capacidadAgua;
    private double longitudEscala;
    public Bombero(String patente, String estacionBase, int capacidadAgua, double longitudEscala) {
        super(patente, estacionBase);
        this.capacidadAgua = capacidadAgua;
        this.longitudEscala = longitudEscala;
    }
    @Override
    public void activarAlerta() {
        System.out.println("bombero: activando sirenas y balizas de emergencia, unidad para combatir incendios");
    }
    }


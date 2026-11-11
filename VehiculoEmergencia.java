public class VehiculoEmergencia {
    private String patente;
    private String estacionBase;
    private boolean enServicio;
    public VehiculoEmergencia(String patente, String estacionBase) {
        this.patente = patente;
        this.estacionBase = estacionBase;
        this.enServicio = enServicio;
    }
    public void activarAlerta() {
        System.out.println("activando sirenas y balizas de emergencia");
    }
    public void mostrarInformacion() {
        System.out.println("Patente: " + patente);
        System.out.println("Estación base: " + estacionBase);
        System.out.println("En servicio: " + enServicio);
    }
}

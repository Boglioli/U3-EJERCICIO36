public class Policial extends VehiculoEmergencia {
    private int cantidadEfectivos;
    private String blindaje;
    public Policial(String patente, String estacionBase, int cantidadEfectivos, String blindaje) {
        super(patente, estacionBase);
        this.cantidadEfectivos = cantidadEfectivos;
        this.blindaje = blindaje;
    }
    @Override
    public void activarAlerta() {
        System.out.println("policial: activando sirenas y balizas de emergencia, patrulla desplegada al operativo");
    }
}

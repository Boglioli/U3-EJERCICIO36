public class Ambulancia extends VehiculoEmergencia {
    private int stockOxigeno;
    private int medicos;
    public Ambulancia(String patente, String estacionBase, int stockOxigeno, int medicos) {
        super(patente, estacionBase);
        this.stockOxigeno = stockOxigeno;
        this.medicos = medicos;
    }
    @Override
    public void activarAlerta() {
        System.out.println("ambulancia: activando sirenas y balizas de emergencia");
    }
}

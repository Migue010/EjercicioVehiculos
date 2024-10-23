public class Electrico extends Vehiculo implements VehiculoElectrico{


    public Electrico(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void EncenderVehiculo() {
        System.out.println("El vehiculo esta encendido");
    }

    @Override
    public void ApagarVehiculo() {
        System.out.println("El vehiculo esta apagado ");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca " +marca+ "Modelo "+modelo+ "Tipo de Combustible "+combustible);
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando Bateria");
    }

    @Override
    public void nivelDeBateria() {
        System.out.println("El vehiculo tiene 70% de Bateria");
    }
}

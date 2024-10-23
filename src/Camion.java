public class Camion extends Vehiculo {


    public Camion(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }



    @Override
    public void EncenderVehiculo() {
        System.out.println("El camion esta encendido");
    }

    @Override
    public void ApagarVehiculo() {
        System.out.println("El camion esta apagado");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca "+ marca+"Modelo " +modelo+"Tipo de Combustible " +combustible);
    }
}

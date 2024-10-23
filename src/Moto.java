public class Moto extends Vehiculo{


    public Moto(String marca, String modelo, String combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void EncenderVehiculo() {
        System.out.println("La moto esta encendida");
    }

    @Override
    public void ApagarVehiculo() {
        System.out.println("La moto esta apgada");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Marca " +marca+"Modelo " +modelo+"Tipo de Combustible " +combustible);
    }
}

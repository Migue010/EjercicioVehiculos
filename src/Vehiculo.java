abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String combustible;

    public Vehiculo(String marca, String modelo, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
    }


    public abstract void  EncenderVehiculo();

    public abstract void ApagarVehiculo();

    public abstract void mostrarInformacion();

    public void abastecerCombustible(){
        System.out.println("El vehiculo abastecio 30% de bateria");
    }

}

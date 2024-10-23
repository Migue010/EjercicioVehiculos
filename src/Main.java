public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Renault", "Twingo","Gasolina");
        Camion camion1 = new Camion("Volvo","FH","Disel");
        Moto moto1 = new Moto("Ducati","Scrambler","Gasolina");
        Electrico electrico1 = new Electrico("BMW","IX3","Carga");


        carro1.EncenderVehiculo();
        carro1.ApagarVehiculo();
        carro1.mostrarInformacion();

        System.out.println("***********************");

        camion1.EncenderVehiculo();
        camion1.ApagarVehiculo();
        camion1.mostrarInformacion();

        System.out.println("***********************");

        moto1.EncenderVehiculo();
        moto1.ApagarVehiculo();
        moto1.mostrarInformacion();

        System.out.println("*********************");

        electrico1.EncenderVehiculo();
        electrico1.ApagarVehiculo();
        electrico1.nivelDeBateria();
        electrico1.cargarBateria();
        electrico1.mostrarInformacion();
        electrico1.abastecerCombustible();
    }
}
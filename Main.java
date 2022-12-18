package Sesion23.Ejemplo.Bien.ConInterface;

public class Main {
    public static void main(String []args) {
        Coche coche = new Coche();
        System.out.println(coche.getTipoVehiculo());

        CocheElectrico cocheElectrico = new CocheElectrico();
        System.out.println(cocheElectrico.getTipoVehiculo());

        Combustible cocheCombustible = new Combustible();
        System.out.println(cocheCombustible.getTipoVehiculo());

        Hibrido cocheHibrido = new Hibrido();
        System.out.println(cocheHibrido.getTipoVehiculo());

    }
}

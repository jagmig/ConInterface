package Sesion23.Ejemplo.Bien.ConInterface;

public class Combustible implements Vehiculo{

    String tipo;

    String combustible;

    public Combustible(){
        this.tipo = "Combustible";
        this.combustible = "Gasolina";
    }


    @Override
    public String getTipoVehiculo() {
        return tipo;
    }

    public String getCombustible(){
        return this.combustible;

    }
}

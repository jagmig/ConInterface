package Sesion23.Ejemplo.Bien.ConInterface;

public class Hibrido implements Vehiculo{
    String tipo;

    String bateria;
    String combustible;

    public Hibrido(){
        this.tipo = "Hibrido";
        this.bateria = "Electrica";
        this.combustible = "Gasolina";
    }


    @Override
    public String getTipoVehiculo() {
        return tipo;
    }

    public String getCombustible(){
        return this.combustible;

    }

    public String getBateria(){

        return this.bateria;
    }
}

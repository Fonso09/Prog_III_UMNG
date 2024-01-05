
package parqueadero;


public class Bici {
   String horain;
   String placa;
   

    public Bici(String horain, String placa) {
        this.horain = horain;
        this.placa = placa;
    }

    public String getHorain() {
        return horain;
    }

    public void setHorain(String horain) {
        this.horain = horain;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
   
}

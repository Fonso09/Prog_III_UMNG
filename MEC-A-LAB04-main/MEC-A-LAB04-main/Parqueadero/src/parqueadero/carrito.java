
package parqueadero;

/**
 *
 * @author Portátil de Fonso
 */
public class carrito {
   String horain;
   String placa;

    public carrito(String horain, String placa) {
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

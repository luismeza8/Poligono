package mx.itson.poligono.entidades;

/**
 * La cantidad de energia utilizada por el cliente.
 * @author lm
 */
public class Consumo {
    private int lecturaActual;
    private int lecturaAnterior;
    private int kWhTotal;
    private double preciokWh;
    private double subtotal;

    public int getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(int lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public int getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(int lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public int getkWhTotal() {
        return kWhTotal;
    }

    public void setkWhTotal(int kWhTotal) {
        this.kWhTotal = kWhTotal;
    }

    public double getPreciokWh() {
        return preciokWh;
    }

    public void setPreciokWh(double preciokWh) {
        this.preciokWh = preciokWh;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
}

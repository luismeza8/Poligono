package mx.itson.poligono.entidades;

/**
 * La desgloce final a pagar.
 * @author lm
 */
public class Importe {
    private Consumo consumo;
    private double iva;
    private double dap;
    private double cargos;
    private double facturacioPeriodo;
    private double redondeo;
    private double pagoAnterior;
    private double total;

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDap() {
        return dap;
    }

    public void setDap(double dap) {
        this.dap = dap;
    }

    public double getCargos() {
        return cargos;
    }

    public void setCargos(double cargos) {
        this.cargos = cargos;
    }

    public double getFacturacioPeriodo() {
        return facturacioPeriodo;
    }

    public void setFacturacioPeriodo(double facturacioPeriodo) {
        this.facturacioPeriodo = facturacioPeriodo;
    }

    public double getRedondeo() {
        return redondeo;
    }

    public void setRedondeo(double redondeo) {
        this.redondeo = redondeo;
    }

    public double getPagoAnterior() {
        return pagoAnterior;
    }

    public void setPagoAnterior(double pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}

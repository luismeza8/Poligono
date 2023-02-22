package mx.itson.poligono.entidades;

import java.util.Date;
import mx.itson.poligono.enumeradores.MetodoPago;

/**
 * El resumen final de consumo energético y de los precios y fechas del servicio.
 * @author lm
 */
public class Recibo {
    private Cliente cliente;
    private Consumo consumo;
    private Importe importe;
    private Date fechaLimitePago;
    private Date periodoFacturadoInicio;
    private Date periodoFacturadoFin;
    private Date fechaCorte;
    private MetodoPago metodoPago;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public Importe getImporte() {
        return importe;
    }

    public void setImporte(Importe importe) {
        this.importe = importe;
    }

    public Date getFechaLimitePago() {
        return fechaLimitePago;
    }

    public void setFechaLimitePago(Date fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    public Date getPeriodoFacturadoInicio() {
        return periodoFacturadoInicio;
    }

    public void setPeriodoFacturadoInicio(Date periodoFacturadoInicio) {
        this.periodoFacturadoInicio = periodoFacturadoInicio;
    }

    public Date getPeriodoFacturadoFin() {
        return periodoFacturadoFin;
    }

    public void setPeriodoFacturadoFin(Date periodoFacturadoFin) {
        this.periodoFacturadoFin = periodoFacturadoFin;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
}

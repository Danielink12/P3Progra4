/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.TipoPagoDao;
import modelo.entidad.TipoPago;

/**
 *
 * @author Daniel Alas
 */
@ManagedBean
@ViewScoped
public class TipoPagoControl implements Serializable{
    private List<TipoPago> listaTipoPagos;
    private TipoPago tipoPago;
    /**
     * Creates a new instance of TipoPagoControl
     */
    public TipoPagoControl() {
    }

    public List<TipoPago> getListaTipoPagos() {
        TipoPagoDao ed = new TipoPagoDao();
        listaTipoPagos = ed.listarTipoPagos();
        return listaTipoPagos;
    }

    public void setListaTipoPagos(List<TipoPago> listaTipoPagos) {
        this.listaTipoPagos = listaTipoPagos;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    public void limpiarTipoPago() {
        tipoPago = new TipoPago();
    }

    public void agregarTipoPago() {
        TipoPagoDao ed = new TipoPagoDao();
        ed.agregar(tipoPago);
    }

    public void modificarTipoPago() {
        TipoPagoDao ed = new TipoPagoDao();
        ed.modificar(tipoPago);
        limpiarTipoPago();
    }

    public void eliminarTipoPago() {
        TipoPagoDao ed = new TipoPagoDao();
        ed.eliminar(tipoPago);
        limpiarTipoPago();
    }

    
}

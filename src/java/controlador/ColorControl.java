/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ViewScoped;
import modelo.dao.ColorDao;
import modelo.entidad.Color;

/**
 *
 * @author Daniel Alas
 */
@ManagedBean
@ViewScoped
public class ColorControl implements Serializable{

    private List<Color> listaColores;
    private Color estado;
    /**
     * Creates a new instance of ColorControl
     */
    public ColorControl() {
    }

    public List<Color> getListaColores() {
        ColorDao ed = new ColorDao();
        listaColores = ed.listarColores();
        return listaColores;
    }

    public void setListaColores(List<Color> listaColores) {
        this.listaColores = listaColores;
    }

    public Color getColor() {
        return estado;
    }

    public void setColor(Color estado) {
        this.estado = estado;
    }
    
    public void limpiarColor() {
        estado = new Color();
    }

    public void agregarColor() {
        ColorDao ed = new ColorDao();
        ed.agregar(estado);
    }

    public void modificarColor() {
        ColorDao ed = new ColorDao();
        ed.modificar(estado);
        limpiarColor();
    }

    public void eliminarColor() {
        ColorDao ed = new ColorDao();
        ed.eliminar(estado);
        limpiarColor();
    }
}
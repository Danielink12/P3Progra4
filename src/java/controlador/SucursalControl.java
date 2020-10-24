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
import modelo.dao.SucursalDao;
import modelo.entidad.Sucursal;

/**
 *
 * @author Daniel Alas
 */
@ManagedBean
@ViewScoped
public class SucursalControl implements Serializable{
    private List<Sucursal> listaSucursales;
    private Sucursal sucursal;
    /**
     * Creates a new instance of SucursalControl
     */
    public SucursalControl() {
    }

    public List<Sucursal> getListaSucursales() {
        SucursalDao ed = new SucursalDao();
        listaSucursales = ed.listarSucursales();
        return listaSucursales;
    }

    public void setListaSucursales(List<Sucursal> listaSucursales) {
        this.listaSucursales = listaSucursales;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void limpiarSucursal() {
        sucursal = new Sucursal();
    }

    public void agregarSucursal() {
        SucursalDao ed = new SucursalDao();
        ed.agregar(sucursal);
    }

    public void modificarSucursal() {
        SucursalDao ed = new SucursalDao();
        ed.modificar(sucursal);
        limpiarSucursal();
    }

    public void eliminarSucursal() {
        SucursalDao ed = new SucursalDao();
        ed.eliminar(sucursal);
        limpiarSucursal();
    }

    
}

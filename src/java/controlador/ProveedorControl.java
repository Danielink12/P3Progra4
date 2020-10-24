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
import modelo.dao.ProveedorDao;
import modelo.entidad.Proveedor;

/**
 *
 * @author Daniel Alas
 */
@ManagedBean
@ViewScoped
public class ProveedorControl implements Serializable{
    private List<Proveedor> listaProveedores;
    private Proveedor proveedor;
    /**
     * Creates a new instance of ProveedorControl
     */
    public ProveedorControl() {
    }

    public List<Proveedor> getListaProveedores() {
        ProveedorDao ed = new ProveedorDao();
        listaProveedores = ed.listarProveedores();
        return listaProveedores;
    }

    public void setListaProveedores(List<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    public void limpiarProveedor() {
        proveedor = new Proveedor();
    }

    public void agregarProveedor() {
        ProveedorDao ed = new ProveedorDao();
        ed.agregar(proveedor);
    }

    public void modificarProveedor() {
        ProveedorDao ed = new ProveedorDao();
        ed.modificar(proveedor);
        limpiarProveedor();
    }

    public void eliminarProveedor() {
        ProveedorDao ed = new ProveedorDao();
        ed.eliminar(proveedor);
        limpiarProveedor();
    }

    
}

package modelo.entidad;
// Generated 23-oct-2020 16:53:23 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private Sucursal sucursal;
     private String nombre;
     private String clave;
     private String nombreCompleto;
     private Boolean activo;
     private Date fechaCreacion;
     private Set<Alquiler> alquilers = new HashSet<Alquiler>(0);
     private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public Usuario() {
    }

    public Usuario(Sucursal sucursal, String nombre, String clave, String nombreCompleto, Boolean activo, Date fechaCreacion, Set<Alquiler> alquilers, Set<Cliente> clientes) {
       this.sucursal = sucursal;
       this.nombre = nombre;
       this.clave = clave;
       this.nombreCompleto = nombreCompleto;
       this.activo = activo;
       this.fechaCreacion = fechaCreacion;
       this.alquilers = alquilers;
       this.clientes = clientes;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Set<Alquiler> getAlquilers() {
        return this.alquilers;
    }
    
    public void setAlquilers(Set<Alquiler> alquilers) {
        this.alquilers = alquilers;
    }
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }




}



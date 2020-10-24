package modelo.entidad;
// Generated 23-oct-2020 16:53:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoPago generated by hbm2java
 */
public class TipoPago  implements java.io.Serializable {


     private Integer idtipoPago;
     private String nombre;
     private Set<Alquiler> alquilers = new HashSet<Alquiler>(0);

    public TipoPago() {
    }

    public TipoPago(String nombre, Set<Alquiler> alquilers) {
       this.nombre = nombre;
       this.alquilers = alquilers;
    }
   
    public Integer getIdtipoPago() {
        return this.idtipoPago;
    }
    
    public void setIdtipoPago(Integer idtipoPago) {
        this.idtipoPago = idtipoPago;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Alquiler> getAlquilers() {
        return this.alquilers;
    }
    
    public void setAlquilers(Set<Alquiler> alquilers) {
        this.alquilers = alquilers;
    }




}


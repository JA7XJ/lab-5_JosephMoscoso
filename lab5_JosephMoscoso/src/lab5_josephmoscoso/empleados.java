/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephmoscoso;

import java.util.Date;

/**
 *
 * @author Joseph
 */
public class empleados {

    private String nombre;
    private String fecha;
    private String user;
    private String contra;
    private String correo;
    private String puesto;

    public empleados() {
    }

    public empleados(String nombre, String fecha, String user, String contra, String correo, String puesto) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.user = user;
        this.contra = contra;
        this.correo = correo;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return correo;
    }

}

package com.tarjetaucoapi.tarjetaucoapi.domains.person;

import javax.persistence.*;

@Entity
@Table(name ="usuario")
public class Person {
    @Id
    private int id;
    @Column(name = "identificacion")
    private String identificacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellido;
    @Column(name = "correo_personal")
    private String correoPersonal;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "id_tarjeta")
    private int idTarjeta;
    //private Record IdHistorial;


    public Person(int id, String identificacion, String nombre, String apellido, String correoPersonal, String direccion, String cargo, int idTarjeta) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoPersonal = correoPersonal;
        this.direccion = direccion;
        this.cargo = cargo;
        this.idTarjeta = idTarjeta;
    }

    public Person() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
}

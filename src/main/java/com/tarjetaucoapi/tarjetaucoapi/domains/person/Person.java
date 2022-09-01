package com.tarjetaucoapi.tarjetaucoapi.domains.person;

import javax.persistence.*;

@Entity
@Table(name ="usuario")
public class Person {
    @Id
    private int id;
    @Column(name = "identificacion")
    private String identification;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "correo_personal")
    private String personalEmail;
    @Column(name = "direccion")
    private String address;
    @Column(name = "cargo")
    private String charge;
    @Column(name = "id_tarjeta")
    private int idCard;



    public Person(int id, String identification, String name, String lastName, String personalEmail, String address, String charge, int idCard) {
        this.id = id;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.personalEmail = personalEmail;
        this.address = address;
        this.charge = charge;
        this.idCard = idCard;
    }

    public Person() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
}

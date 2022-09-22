package com.tarjetaucoapi.tarjetaucoapi.domains.user;

import javax.persistence.*;

@Entity
@Table(name= "person")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_usuario")
    private String userName;
    @Column(name = "clave")
    private String password;

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

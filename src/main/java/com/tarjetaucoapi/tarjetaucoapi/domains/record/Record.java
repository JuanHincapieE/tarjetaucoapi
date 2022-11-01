package com.tarjetaucoapi.tarjetaucoapi.domains.record;

import javax.persistence.*;

@Entity
@Table(name="historial")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="descripcion")
    private String description;
    @Column(name="id_compra")
    private int idPurchase;

    public Record() {
    }

    public Record(int id, String description, int idPurchase) {
        this.id = id;
        this.description = description;
        this.idPurchase = idPurchase;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
}

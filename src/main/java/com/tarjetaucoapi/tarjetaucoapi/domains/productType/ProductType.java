package com.tarjetaucoapi.tarjetaucoapi.domains.productType;
import javax.persistence.*;

@Entity
@Table(name ="tipo_producto")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;

    public ProductType(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ProductType() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

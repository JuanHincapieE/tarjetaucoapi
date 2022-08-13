package com.tarjetaucoapi.tarjetaucoapi.core.person.model;

public class PersonModel {

    private String name;

    private String documentType;

    private  int documentNumber;

    public PersonModel(String name, String documentType, int documentNumber) {
        this.name = name;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }
}

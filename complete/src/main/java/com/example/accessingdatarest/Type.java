package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Type {

    public Type(String type) {
        this.type = type;
    }

    public Type() {

    }

    public String getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setType(String type) {
        this.type = type;
    }

    String type;



    @GeneratedValue
    @Id
    private Long id;



}

package com.example.accessingdatarest;

import javax.persistence.*;
import java.util.List;

@Entity
public class Phone {
    @Id
    @GeneratedValue
    private Long id;

    public Phone(String number,Type type) {
        this.type=type;
        this.number=number;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }


    public void setType(Type type) {
        this.type = type;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Type type;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Contact contact;

    private  String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone() {

    }

}

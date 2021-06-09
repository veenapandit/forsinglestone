package com.example.accessingdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ContactResource {

    @Autowired
    private ContactRepository contactRepository;


    @PostMapping("/contacts")
    public void createContact(Contact contact) {
        contactRepository.save(contact);
    }

    @PutMapping("/contacts/{id}")
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @GetMapping("/contacts/{id}")
    public Optional<Contact> findContactById(String id) {
        return contactRepository.findById(Long.parseLong(id));
    }
    @DeleteMapping("/contacts/{id}")
    public void deleteContactById(String id) {
        contactRepository.deleteById(Long.parseLong(id));

    }

    @GetMapping("/contacts/call-list")
    public Iterable<Contact> getCallList() {

       return  contactRepository.getCallList();


    }

    @GetMapping("/contacts")
    public Iterable<Contact> getAlllContacts() {
        return contactRepository.findAll();
    }
}

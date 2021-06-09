package com.example.accessingdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AccessingDataRestApplication {
    @Autowired
    private ContactRepository contactRepository;


    public static void main(String[] args) {
        SpringApplication.run(AccessingDataRestApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

        return args -> {

            Name name = new Name("james", "Butt", "Benton");
            Address address = new Address("6649 N Blue Gum St", "New Orleans", "LA", "70116");
            Phone p1 = new Phone("504-621-8927", new Type("home"));
            Phone p2 = new Phone("504-621-8928", new Type("mobile"));
            Phone p3 = new Phone("504-621-8929", new Type("work"));
            List<Phone> phoneNumbers = new ArrayList<>();

            phoneNumbers.add(p1);
            phoneNumbers.add(p2);
            phoneNumbers.add(p3);
            Contact contact = new Contact();
            contact.setName(name);
            contact.setAddress(address);

            address.setContactId(contact.getId());
            name.setContactId(contact.getId());
            p1.setContact(contact);
            p2.setContact(contact);
            p3.setContact(contact);
            contact.setPhone(phoneNumbers);
            contactRepository.save(contact);
/***/

            name = new Name("Josephine", "Darakty", "Chanay");
            address = new Address("4 B Blue Ridge Blvd Brighton", "Livingston", "MI", "48116");
            p1 = new Phone("810-292-9388", new Type("home"));
            p2 = new Phone("810-374-9840", new Type("mobile"));
            p3 = new Phone("810-374-9841", new Type("work"));
            phoneNumbers = new ArrayList<>();
            phoneNumbers.add(p3);
            phoneNumbers.add(p1);
            phoneNumbers.add(p2);
            contact = new Contact();
            contact.setName(name);
            contact.setAddress(address);

            address.setContactId(contact.getId());
            name.setContactId(contact.getId());
            p1.setContact(contact);
            p2.setContact(contact);
            p3.setContact(contact);
            contact.setPhone(phoneNumbers);
            contactRepository.save(contact);
/***/


            name = new Name("Venere", "Chemel", "James");
            address = new Address("8 W Cerritos Ave BridgePort", "Gloucester", "NJ", "80141");
            p1 = new Phone("856-366-1388", new Type("home"));
            p2 = new Phone("856-274-5840", new Type("mobile"));
            p3 = new Phone("856-374-9841", new Type("work"));
            phoneNumbers = new ArrayList<>();

            phoneNumbers.add(p1);
            phoneNumbers.add(p2);
            phoneNumbers.add(p3);
            contact = new Contact();
            contact.setName(name);
            contact.setAddress(address);

            address.setContactId(contact.getId());
            name.setContactId(contact.getId());
            p1.setContact(contact);
            p2.setContact(contact);
            p3.setContact(contact);
            contact.setPhone(phoneNumbers);
            contactRepository.save(contact);
            /**/

            name = new Name("James", "J", "Dorrell");
            address = new Address("56 E Morehead St ", "Montgomery", "PA", "19943");
            p1 = new Phone("215-874-1229", new Type("home"));
            p2 = new Phone("856-442-8694", new Type("mobile"));
            p3 = new Phone("215-374-7908", new Type("work"));
            phoneNumbers = new ArrayList<>();

            phoneNumbers.add(p1);
            phoneNumbers.add(p2);
            phoneNumbers.add(p3);
            contact = new Contact();
            contact.setName(name);
            contact.setAddress(address);

            address.setContactId(contact.getId());
            name.setContactId(contact.getId());
            p1.setContact(contact);
            p2.setContact(contact);
            p3.setContact(contact);
            contact.setPhone(phoneNumbers);
            contactRepository.save(contact);
            /**/

            name = new Name("Rose", "E", "Chapman");
            address = new Address("639 Main St", "Anchorage", "AK", "95501");
            p1 = new Phone("907-385-4412", new Type("home"));
            p2 = new Phone("907-921-2010", new Type("mobile"));
            p3 = new Phone("907-554-8041", new Type("work"));
            phoneNumbers = new ArrayList<>();

            phoneNumbers.add(p1);
            phoneNumbers.add(p2);
            phoneNumbers.add(p3);
            contact = new Contact();
            contact.setName(name);
            contact.setAddress(address);

            address.setContactId(contact.getId());
            name.setContactId(contact.getId());
            p1.setContact(contact);
            p2.setContact(contact);
            p3.setContact(contact);
            contact.setPhone(phoneNumbers);
            contactRepository.save(contact);
        };
    }
}


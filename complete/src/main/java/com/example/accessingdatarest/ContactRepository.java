package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.management.Query;

//@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

	List<Contact> findContactById(@Param("id") Long id);

	@Override
	Iterable<Contact> findAll();


    Contact save(Contact contact);

	@Override
	void delete(Contact contact);

	@org.springframework.data.jpa.repository.Query("select c.name.first, c.name.last, p.number from Contact c, Phone p, Type  t where p.type.id = t.id and c.id = p.contact.id order by c.name.first, c.name.last")
    Iterable<Contact> getCallList();
}

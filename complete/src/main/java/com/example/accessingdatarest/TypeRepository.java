package com.example.accessingdatarest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


//@RepositoryRestResource(collectionResourceRel = "type", path = "type")
@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {


    Type save(String type);





}

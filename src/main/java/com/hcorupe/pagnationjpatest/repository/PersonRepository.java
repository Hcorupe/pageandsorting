package com.hcorupe.pagnationjpatest.repository;

import com.hcorupe.pagnationjpatest.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>, CrudRepository<Person, Integer>{


}

package com.example.crud.Repository;

import com.example.crud.Model.Person;

import java.util.List;

public interface IPersonRepo {

    List<Person> fetchAll();
    Person findPersonById(int id);
    boolean addPerson(Person p);
    boolean deletePerson(int id);
    boolean updatePerson(Person p);
}

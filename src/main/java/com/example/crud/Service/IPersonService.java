package com.example.crud.Service;

import com.example.crud.Model.Person;

import java.util.List;

public interface IPersonService {

    List<Person> fetchAll();
    Person findPersonById(int id);
    boolean addPerson(Person p);
    boolean deletePerson(int id);
    boolean updatePerson(Person p);
}

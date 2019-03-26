package com.example.crud.Repository;

import com.example.crud.Model.Person;
import com.sun.rowset.internal.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepo implements IPersonRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> fetchAll() {
        String sql = "SELECT * FROM person.person";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public Person findPersonById(int id) {
        String sql = "SELECT * FROM person.person WHERE idperson=?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    @Override
    public boolean addPerson(Person p) {
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        String sql = "DELETE FROM person.person WHERE idperson=?";
        jdbcTemplate.update(sql,id);
        return false;
    }

    @Override
    public boolean updatePerson(Person p) {
        return false;
    }
}

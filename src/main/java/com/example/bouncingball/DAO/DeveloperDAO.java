package com.example.bouncingball.DAO;

import com.example.bouncingball.Model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeveloperDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getDeveloper(String name) {
//        String sql = "SELECT * FROM developer WHERE name = ?;";
//        RowMapper<Developer> rowMapper1 = new BeanPropertyRowMapper<>(Developer.class);
//        Developer developer = jdbcTemplate.queryForObject(sql, rowMapper1, name);
//
//        assert developer != null;
//        return developer.toString();

        List<Developer> developer = jdbcTemplate.query(
                "SELECT * FROM developer WHERE name = ?;",
                new BeanPropertyRowMapper<>(Developer.class), name);
        String developerName = developer.get(0).getName();
        String developerOccupation = developer.get(0).getOccupation();

        return developerName +"\n" + developerOccupation;
    }

}

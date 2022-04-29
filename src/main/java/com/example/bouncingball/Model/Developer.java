package com.example.bouncingball.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
public class Developer {
    private String name;
    private String occupation;
    private String program;
    private String school;

    @Override
    public String toString() {
        System.out.println(name);
        System.out.println(occupation);
        System.out.println(program);
        System.out.println(school);
        return name + '\n' +
                occupation + '\n' +
                 program + '\n' +
                 school ;
    }
}

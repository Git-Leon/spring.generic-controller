package com.github.git_leon.mvc;

import org.springframework.data.annotation.Id;

public class Person {
    String name;
    int age;

    @Id
    Long id;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

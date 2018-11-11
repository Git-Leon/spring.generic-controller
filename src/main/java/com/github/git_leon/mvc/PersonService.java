package com.github.git_leon.mvc;

import com.github.git_leon.lcontroller.LService;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends LService<Person, Long> {
    public PersonService(PersonRepository repository) {
        super(repository);
    }
}

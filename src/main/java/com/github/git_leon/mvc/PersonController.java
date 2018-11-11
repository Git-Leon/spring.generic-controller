package com.github.git_leon.mvc;

import com.github.git_leon.lcontroller.LController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/person")
public class PersonController extends LController<Person, Long> {
    public PersonController(PersonService service) {
        super(service);
    }
}

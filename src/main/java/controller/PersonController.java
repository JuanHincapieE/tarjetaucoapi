package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/rest")

public class PersonController {

    @GetMapping("/person")
    public String  getPerson(){

        return "Estoy retornando una persona";

    }


}

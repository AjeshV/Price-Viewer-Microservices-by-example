package com.microservices.dbservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController;
@RequestMapping("/rest/db")
public class DbServiceResource{

    private QuotesRepository quotesRepository;

    @GetMapping("/{username}")
    //return list of string
    public List<String> getQuotes(@PathVariable("username")
                                  final String username){
        quotesRepository.findByUserName(username);
        return null;
    }
}
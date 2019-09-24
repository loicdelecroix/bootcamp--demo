package com.loic.bootcamp.controller;

import com.loic.bootcamp.entity.Country;
import com.loic.bootcamp.repository.CountryRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CountryController {

    @Resource
    private CountryRepository countryRepository;

    @RequestMapping("/country")
    public Country country(@RequestParam(value="name") String name) {
        return countryRepository.findCountry(name);
    }

}

package com.jpacourse.rest;

import com.jpacourse.dto.AddressTO;
import com.jpacourse.rest.exception.EntityNotFoundException;
import com.jpacourse.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController
{

    private final AddressService addressService;


    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address/{id}")
    AddressTO findById(@PathVariable final Long id) {
        final AddressTO address = addressService.findById(id);
        if(address != null)
        {
            return address;
        }
        throw new EntityNotFoundException(id);
    }

    @GetMapping("/address")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}

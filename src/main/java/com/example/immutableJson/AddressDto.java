package com.example.immutableJson;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class AddressDto {

    private final String street;
    private final String city;

    AddressDto(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

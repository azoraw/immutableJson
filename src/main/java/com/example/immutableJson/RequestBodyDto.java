package com.example.immutableJson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Value;

@Getter
@Value
public class RequestBodyDto {

    private final String name;
    private final String age;
    private final AddressDto address;

    @JsonCreator
    RequestBodyDto(String age, String name, @JsonProperty("addressDto") AddressDto address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

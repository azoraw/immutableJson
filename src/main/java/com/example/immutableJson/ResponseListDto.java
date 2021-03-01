package com.example.immutableJson;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Value;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Value
@Builder
@JsonInclude(NON_NULL) // vs NON_EMPTY
public class ResponseListDto {

    private final boolean empty;
    private final List<String> list;

}


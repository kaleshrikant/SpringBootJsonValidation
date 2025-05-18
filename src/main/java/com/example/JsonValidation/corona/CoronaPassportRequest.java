package com.example.JsonValidation.corona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoronaPassportRequest {
    private Passport passport;
    private Person person;
}

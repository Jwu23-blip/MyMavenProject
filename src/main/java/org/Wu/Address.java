package org.Wu;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private Province province;
    private String postalCode;
}

public Address(int streetNo, String street, String city, Province province, String postalCode){
    if (isPostalCodeValid(postalCode)) {

    }
}

package org.Wu;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode.toUpperCase();
    } else {
        this.streetNo = 0;
        this.street = null;
        this.city = null;
        this.province = null;
        this.postalCode = null;
    }
}

package no.hvl.dat250.jpa.exp2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String street;
    private Integer number;

    // Use mappedBy to set the owner to Person.addresses field
    // so we don't create two join tables.
    @ManyToMany(mappedBy = "addresses")
    private List<Person> persons = new ArrayList<>();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

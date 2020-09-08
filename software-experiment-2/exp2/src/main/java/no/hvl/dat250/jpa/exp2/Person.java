package no.hvl.dat250.jpa.exp2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany
    List<CreditCard> creditCards = new ArrayList<>();

    @ManyToMany
    List<Address> addresses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

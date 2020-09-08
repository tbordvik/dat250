package no.hvl.dat250.jpa.exp2;

import javax.persistence.Embeddable;

@Embeddable
public class Pincode {

    private String pincode;
    private Integer count;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
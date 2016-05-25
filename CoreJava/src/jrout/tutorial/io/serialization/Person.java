package jrout.tutorial.io.serialization;

import java.io.Serializable;

/**
 * Created by Jayram on 5/24/2016.
 */
// Interface having no methods are know as Marker Interfaces

public class Person implements Serializable {
    private static final long serialVersionUID = -32232323232L;

    private String personName;
    private String address;
//    private transient int ssn;
    private int ssn;
    private String personJob;

    public Person(String personName, String address, int ssn){
        this.personName = personName;
        this.address = address;
        this.ssn = ssn;
    }
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}

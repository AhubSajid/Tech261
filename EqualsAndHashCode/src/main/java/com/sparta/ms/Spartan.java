package com.sparta.ms;

import java.util.Objects;

public class Spartan {

    public Spartan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spartan spartan = (Spartan) o;
        return Objects.equals(firstName, spartan.firstName) && Objects.equals(lastName, spartan.lastName);
    }*/

    @Override
    public boolean equals(Object object){
       if(this== object){
           return true;
       }
       return (object instanceof Spartan spartan)
               && getFirstName().equals(spartan.firstName)
               && getLastName().equals(spartan.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
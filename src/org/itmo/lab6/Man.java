package org.itmo.lab6;

abstract class Man {
    protected String firstName;
    protected String surname;
    public Man(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
    public abstract void vivodInformatsii();
}



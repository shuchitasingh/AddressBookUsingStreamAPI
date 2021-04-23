package com.bridgelabz;

public interface IAddressBook {
    public void add();
    public void edit(String firstName);
    public void deletePerson(String firstName);
    public void addMultiplePerson();
    public void sortByfirstName();
    public void display();
    public void sortByZipcode();
    void viewByCity(String city);
    void viewByState(String state);
    void searchPersonInCity(String firstName);
    void searchPersonInState(String firstName);

}

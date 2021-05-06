package com.bridgelabz;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookImpl  implements IAddressBook {
    Scanner scanner = new Scanner(System.in);
    List<Person> list = new ArrayList<Person>();

    public void add() {
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        System.out.println("Enter your city");
        String city = scanner.nextLine();
        System.out.println("Enter your state");
        String state = scanner.nextLine();
        System.out.println("Enter your phone");
        long mobileNo = scanner.nextLong();
        System.out.println("Enter your zip code");
        String zip = scanner.next();

        Person person = new Person(firstName, lastName, address, city, state, mobileNo, zip);
        list.add(person);
    }

    @Override
    public void edit(String firstName) {
        for (int i = 0; i < list.size(); i++)
        {
            Person person = list.get(i);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
            String address = scanner.nextLine();
            person.setAddress(address);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
            String city = scanner.nextLine();
            person.setCity(city);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
            String state = scanner.nextLine();
            person.setState(state);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
            String zip = scanner.nextLine();
            person.setPincode(zip);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
            int PhoneNo = scanner.nextInt();
            person.setMobileNo(PhoneNo);


            System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
        }
    }
    @Override
    public void deletePerson(String firstName) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getFirstName().equalsIgnoreCase(firstName))
            {
                Person person = list.get(i);
                list.remove(person);
            }
        }
    }

    @Override
    public void addMultiplePerson() {
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("No duplicate entry acceptable please enter valid name");
                return;
            }
            // System.out.println("enter your first name:");
            //
            // String firstName = scanner.nextLine();
            System.out.println("enter your last name:");
            String lastName = scanner.nextLine();
            System.out.println("enter your address");
            String address = scanner.nextLine();
            System.out.println("enter your city");
            String city = scanner.nextLine();
            System.out.println("enter your state");
            String state = scanner.nextLine();
            System.out.println("enter your phone");
            long mobileNo = scanner.nextLong();
            System.out.println("enter your zip code");
            String zip = scanner.next();

            Person person = new Person(firstName, lastName, address, city, state, mobileNo, zip);
            list.add(person);
        }
    }
    @Override
    public void sortByfirstName() {
        {
            Collections.sort(list,(name1, name2)  -> name1.getFirstName().compareTo(name2.getFirstName()));
            System.out.println(list);
        }
    }
    public void display() {
        for (Person person : list)
            System.out.println(person);
    }

    @Override
    public void sortByZipcode() {
        {
            Collections.sort(list,( z1,z2)  -> z1.getFirstName().compareTo(z2.getFirstName()));
            System.out.println(list);
        }
    }
    @Override
    public void viewByCity(String city) {
        List<Person> people = list.stream().filter(person1 -> person1.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        for (Person person: people )
        {
            System.out.println(person);
        }
    }

    @Override
    public void viewByState(String state) {
        List<Person> people = list.stream().filter(person1 -> person1.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
        for (Person person: people )
        {
            System.out.println(person);
        }

    }

    @Override
    public void searchPersonInCity(String firstName) {
        List<Person> people = list.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());

        for (Person person: people)
        {
            System.out.println(person.getFirstName()+"---->"+person.getCity());
        }
    }

    @Override
    public void searchPersonInState(String firstName) {
        List<Person> people = list.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
        for (Person person: people)
        {
            System.out.println(person.getFirstName()+"---->"+person.getState());
        }

    }
}

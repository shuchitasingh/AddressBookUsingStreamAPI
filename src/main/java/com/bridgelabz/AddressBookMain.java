package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book programm");
        Scanner scanner= new Scanner(System.in);
        AddressBookImpl addressBook =new AddressBookImpl();
        boolean condition = true;
        while (condition == true)
        {
            System.out.println("1.Add_Person  2.Display_Person  3.Edit_person  4.Delete_Person  5.SortByName_Or_Zip  6.Quit_From_It");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    addressBook.display();
                    break;
                case 3:
                    System.out.println("Enter person's frist name");
                    String name=scanner.next();
                    addressBook.edit(name);
                    break;
                case 4:
                    System.out.println("Enter person's name");
                    String firstName=scanner.next();
                    addressBook.deletePerson(firstName);
                    System.out.println("Person's data successfully delete");
                    break;
                case 5:
                    String sortedfirstName=scanner.next();
                    addressBook.sortByfirstName();
                    System.out.println("sorted firstname successfully");
                    break;
                case 6:
                    addressBook.sortByZipcode();
                     System.out.println("sorted zipcode successfully");
                    break;
                case 7:
                    addressBook.addMultiplePerson();
                    addressBook.addmultiplePerson(firstName);
                     System.out.println("addmultiple person successfully");
                    break;
                case 8:
                    System.out.println("press 1 for view by city and 2 for view by state");
                    int option = scanner.nextInt();
                    if (option == 1)
                    {
                        System.out.println("enter city name");
                        String city = scanner.next();
                        addressBook.viewByCity(city);
                        break;
                    }
                    else
                    {
                        System.out.println("enter state name");
                        String state = scanner.next();
                        addressBook.viewByState(state);
                        break;
                    }
                case 10:
                    System.out.println("press 1 for search person in city and 2 for seatch person in  state");
                    int localoption1 = scanner.nextInt();
                    if (localoption1 == 1)
                    {
                        System.out.println("enter person firstName");
                        String firstname = scanner.next();
                        addressBook.searchPersonInCity(firstname);
                        break;
                    }
                    else
                    {
                        System.out.println("enter state firstName");
                        String firstname = scanner.next();
                        addressBook.searchPersonInState(firstname);
                        break;

                    }
                case 9:
                    condition = false;
                    break;
                default:
                    System.out.println("Please enter the valid value");
                    continue;
            }
        }
    }

}

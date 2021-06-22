package com.sapient.trg.pl;

import com.sapient.trg.service.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person1= new Person(1,"Kriti","Jain", null, null);
        System.out.println(person1.getFirstName()+" "+person1.getLastName());
    }
}

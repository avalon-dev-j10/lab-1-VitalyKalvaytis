package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Main {

    public static void main(String[] args) {

        Passport passportIvanov = new Passport("4010 859696","Иванов", "Иван" , "Иванович",
                "", new Date(11, 04, 1987), new Date(11, 04, 1997),
                "УФМС г. СПб по Фрунзенскому району номер 72");
        Address addressIvanov = new Address("РФ", "СПб", "Будапештская", "34/1", "84");
        Person ivanov = new Person(passportIvanov, addressIvanov);
        
        String ivanovName = ivanov.getFullName();
        String ivanovAddress = ivanov.getAddress();
        
        System.out.println(ivanovName);
        System.out.println(ivanovAddress);
        
        Passport passportSmith = new Passport("BY56 CC8569","John", "Edvard" , "Smith",
                "", new Date(01, 01, 1960), new Date(10, 01, 1980),
                "PO 8568 Washington D.C.");
        Address addressSmith = new Address("USA", "Washington", "Lincoln", "6A", "2");
        Person smith = new Person(passportSmith, addressSmith);
        
        String smithName = smith.getFullName();
        String smithAddress = smith.getAddress();
        
        System.out.println(smithName);
        System.out.println(smithAddress);
}     
        
        //
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */


        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */

}

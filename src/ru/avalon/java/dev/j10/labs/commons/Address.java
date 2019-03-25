
/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;


    public Address(String country, String city, String street, String house, String apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
       
    public String getCountry(){
        return country;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
    }

    public String getHouse(){
        return house;
    }
    
    public String getApartment(){
        return apartment;
    }
    
    public String getFullAddress(){
        return "Страна: " + country + " Город: " + city + " Улица: " + street + " Дом: " + house + " Квартира: " + apartment;
    } 
}

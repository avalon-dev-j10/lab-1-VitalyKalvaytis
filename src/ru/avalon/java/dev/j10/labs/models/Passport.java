package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;



/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

public class Passport {
    private String serialNumber;
    private String name;
    private String surname;
    private String firstname;
    private String secondname;
    private Date BirthDate;
    private Date getDate;
    private String Policy;

    public Passport(String serialNumber, String name, String surname, String firstname, String secondname, Date BirthDate, Date getDate, String Policy) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.surname = surname;
        this.firstname = firstname;
        this.secondname = secondname;
        this.BirthDate = BirthDate;
        this.getDate = getDate;
        this.Policy = Policy;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public Date getGetDate() {
        return getDate;
    }

    public String getPolicy() {
        return Policy;
    }
    
    public String getFullName() {
        String pName = getName();
        String pSurname = getSurname();
        String firstName = getFirstname();
        String secondName = getSecondname();

        if (pName != null && pSurname != null && firstName != null){
            return pSurname + " " + pName + " " + firstName;
        }

        if (firstName == null && secondName != null) {
            return pName + " " + secondName.substring(0 ,1).toUpperCase() + ". " + pSurname;
        }

        if (firstName == null && secondName == null) {
            return pName + " " + pSurname;
        }
        return "";
    }

}

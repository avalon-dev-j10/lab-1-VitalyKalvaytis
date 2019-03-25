package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Person {
    private String name;
    private Passport thisPassport;
    private Address thisAddress;
    
    public Person(String name, Passport thisPassport, Address thisAddress){
        this.name = getFullName();
        this.thisPassport = thisPassport;
        this.thisAddress = thisAddress;
    }

    public Person(Passport thisPassport, Address thisAddress) {
        this.thisPassport = thisPassport;
        this.thisAddress = thisAddress;
    }
    
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        String pName = thisPassport.getName();
        String surname = thisPassport.getSurname();
        String firstName = thisPassport.getFirstname();
        String secondName = thisPassport.getSecondname();

        if (pName != null && surname != null && firstName != null){
            return surname + " " + pName + " " + firstName;
        }

        if (firstName == null && secondName != null) {
            return pName + " " + secondName.substring(0 ,1).toUpperCase() + ". " + surname;
        }

        if (firstName == null && secondName == null) {
            return pName + " " + surname;
        }
        return "";
    }
    
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        String myAdd = thisAddress.getFullAddress();
        
        if (!(myAdd.length() == 0)){ 
            return myAdd;}
        return "";
    }
    
    public void setThisPassport(Passport thisPassport) {
        this.thisPassport = thisPassport;
    }

    public void setThisAddress(Address thisAddress) {
        this.thisAddress = thisAddress;
    }
    
    public Passport getThisPassport() {
        return thisPassport;
    }

}

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

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */


    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */


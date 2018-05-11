package com.sbt.lessons.lessonTwo;

/**
 * Класс человека со свойствами <b>firstName</b> и <b>lastName</b>
 *
 * @author Макаров Никита
 * @version 1.0
 */
public class person {
    /**
     * Имя создаваемого человека
     */
    private final String firstName;

    /**
     * Фамилия создаваемого человека
     */
    private final String lastName;

    /**
     * Пол создаваемого человека
     */
    private final persongender gender;

    /**
     * Установка имени супруга/супруги, не финилизируем посколько может быть не инициализировано
     */
    private person spouse;


    /**
     * Констроктор создания объекта с параметрами
     * @param firstName - Имя
     * @param lastName  - Фамилия
     * @param gender    -  Пол
     */
    public person(String firstName, String lastName, persongender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    /**
     * Метод получения значения поля {@link person#firstName}
     * @return Возврашает значение имени
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Метод получения значения поля {@link person#lastName}
     * @return Возврашает значение фамилии
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Метод получения значения поля {@link person#spouse}
     * @return Возвращает значение семейного положения человека
     */
    public person getSpouse() {
        return spouse;
    }

    /**
     * Метод устаноки Супруга/Супруги {@link person#spouse}
     * @param spouse - Супруг/Супруга
     */
    public void setSpouse(person spouse) {
        this.spouse = spouse;
    }

    public persongender getGender() {
        return gender;
    }

    /**
     * Метод проверяюший равенство полов, если пол отличается, то пытаемся поженить их
     * Если у человека более одного брака, то выполним развод
     * @param P Новый супруг/супруга для текушего человека
     * @return возвращает true, если у этого человека другой пол
     * и они не не являются мужем и женой, false в противном случае
     */
    public boolean marry(person P){
        return false;
    }

    /**
     * Устанавливает spouse в значение null при условии что spouse is not null
     * @return true - если статус барка изменен
     */
    public  boolean divorce(){
        return  true;
    }
}

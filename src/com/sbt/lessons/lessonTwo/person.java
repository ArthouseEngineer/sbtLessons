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
     *
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
     *
     * @return Возврашает значение имени
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Метод получения значения поля {@link person#lastName}
     *
     * @return Возврашает значение фамилии
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Метод получения значения поля {@link person#spouse}
     *
     * @return Возвращает значение семейного положения человека
     */
    public person getSpouse() {
        return spouse;
    }

    /**
     * Метод устаноки Супруга/Супруги {@link person#spouse}
     *
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
     * Если у одного из имеется брак, то выполним развод, а затем поженим их вывзвав marry()
     *
     * @param p Новый супруг/супруга для текушего человека
     * @return возвращает true, если у этого человека другой пол и
     * человек не находится в состоянии брака, в противном случае false
     */
    public boolean marry(person p) {

        if (this.getGender() != p.getGender() //&& p.getSpouse() != this.getSpouse()
                || (p.getSpouse() == null && this.getSpouse() == null)) {
            this.setSpouse(p);
            p.setSpouse(this);
            return true;
        }

        if (this.getSpouse() != null || p.getSpouse() != null) {
            this.divorce();
            p.divorce();
            this.setSpouse(p);
            p.setSpouse(this);
            return false;
        }
        return false;
    }


    /**
     * Устанавливает spouse в значение null при условии что spouse is not null
     *
     * @return true - если статус барка изменен
     */
    public boolean divorce() {
        if (this.getSpouse() != null) {
            this.spouse = null;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("First name is : " + this.getFirstName() + " \nLast name is : " + this.getLastName() +
                "\nGender of person is : " + this.getGender() + "\nSupose is : " + this.getSpouse().getFirstName()
                + " " + this.getSpouse().getLastName());
    }
}

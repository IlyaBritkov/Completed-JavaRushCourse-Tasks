package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDate;
    public static final SimpleDateFormat outputSimpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        switch (sex) {
            case MALE:
                return String.format("%s м %s", this.name, outputSimpleDateFormat.format(this.birthDate));
            case FEMALE:
                return String.format("%s ж %s", this.name, outputSimpleDateFormat.format(this.birthDate));
            default:
                return null;
        }
    }
}

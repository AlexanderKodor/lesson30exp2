package com.alex.entity;

public class FullName {
    private String name;
    private String patronymicName;
    private String surname;

    public FullName() {
    }

    public FullName(String name, String patronymicName, String surname) {
        this.name = name;
        this.patronymicName = patronymicName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Полное имя: " + name + ' ' + patronymicName + ' ' + surname + '.';
    }
}

package com.alex.entity;

import java.util.Objects;

public class FullName {
    private String name;
    private String patronymicName;
    private String surname;

    public FullName(String name, String patronymicName, String surname) {
        this.name = name;
        this.patronymicName = patronymicName;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Полное имя: " + name + ' ' + patronymicName + ' ' + surname + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FullName fullName)) return false;
        return Objects.equals(getName(), fullName.getName()) && Objects.equals(getPatronymicName(), fullName.getPatronymicName()) && Objects.equals(getSurname(), fullName.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPatronymicName(), getSurname());
    }
}

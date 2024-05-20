package com.alex;

import com.alex.entity.AuthorList;

public class Main {
    private static AuthorList list = new AuthorList();
    public static void main(String[] args) {
        System.out.println("Автор - " + list.addAuthor("Кодоров Александр Анатольевич") + " - добавлен в список");
        System.out.println("Автор - " + list.addAuthor("Сидоров Петр Иванович") + " - добавлен в список");
        System.out.println("Автор - " + list.addAuthor("Варенников Федр Викторович") + " - добавлен в список");
        System.out.println("Автор - " + list.addAuthor("Вунь Ян И") + " - добавлен в список");
    }
}

package com.alex.entity;

import com.alex.service.StringToFio;

import java.util.ArrayList;
import java.util.List;

public class AuthorList {
    private List<FullName> authorList = new ArrayList<>();
    private StringToFio stf = new StringToFio();

    public FullName addAuthor(String nameAuthor){
        FullName fullName = stf.parsename(nameAuthor);
        authorList.add(fullName);
        return fullName;
    }

}

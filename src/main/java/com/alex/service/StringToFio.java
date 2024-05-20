package com.alex.service;

import com.alex.entity.FullName;
import com.alex.exception.RegexValidationException;

public class StringToFio {
    public static final String FULL_NAME_REGEX = "^[А-Я][А-Яа-я-]+ [А-Я][а-я]* [А-Я][а-я]+$";
    public static final String DOUBLE_SURNAME_REGEX = "[А-Я][а-я]+-[А-Я][а-я]+";
    public static final String NAME_REGEX = "[А-Я][а-я]+";
    public static final String PATRONYMIC_REGEX = "[А-Я][а-я]+";

    public FullName parsename(String inS) {
        if (!inS.matches(FULL_NAME_REGEX)) {
            throw new RegexValidationException(inS, FULL_NAME_REGEX);
        }
        String[] fio = inS.split(" ");
        StringToFio stf = new StringToFio();
        stf.validateSurname(stf, fio[0]);
        stf.validateName(fio[1]);
        FullName fullName = null;
        if (stf.validatePatronymicname(fio[2]))
            fullName = new FullName(fio[1], fio[2], fio[0]);
        return fullName;
    }

    public void validateName(String str) {
        if (!str.matches(NAME_REGEX)) {
            throw new RegexValidationException(str, NAME_REGEX);
        }
    }

    public void validateSurname(StringToFio stf, String str) {
        if (str.contains("-")) {
            if (!str.matches(DOUBLE_SURNAME_REGEX)) {
                throw new RegexValidationException(str, DOUBLE_SURNAME_REGEX);
            }
        } else {
            stf.validateName(str);
        }
    }

    public Boolean validatePatronymicname(String str) {
        if (!str.matches(PATRONYMIC_REGEX)) {
            throw new RegexValidationException(str, PATRONYMIC_REGEX);
        }
        return true;
    }
}

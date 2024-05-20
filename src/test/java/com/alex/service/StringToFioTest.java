package com.alex.service;

import com.alex.entity.FullName;
import com.alex.exception.RegexValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class StringToFioTest {
    StringToFio stf;

    @BeforeEach
    public void setUp(){
        stf = new StringToFio();
    }


    @Test
    public void validateName_failed(){
        Executable actual = () -> stf.validateName("А");
        assertThrows(RegexValidationException.class, actual);
    }
    @Test
    public void validatePatronymicname_success(){
        assertTrue(stf.validatePatronymicname("Анатольевич"));
    }
    @Test
    public void validatePatronymicname_failed(){
        Executable actual = () -> stf.validatePatronymicname("А");
        assertThrows(RegexValidationException.class, actual);
    }
    @Test
    public void parsename_success(){
        FullName fullName = new FullName("Петр", "Иванович", "Сидоров");
        assertEquals(fullName, stf.parsename("Сидоров Петр Иванович"));
    }
}

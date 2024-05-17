package com.alex;

import com.alex.exception.RegexValidationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}

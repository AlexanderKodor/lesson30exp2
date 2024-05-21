package com.alex.entity;

import com.alex.service.StringToFio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthorListTest {
    @Mock
    private StringToFio stringToFio;

    @InjectMocks
    private AuthorList authorList;

    @Test
    void addAuthor_access(){
        String strName = "Сидоров Петр Иванович";
        FullName fullName = new FullName("Петр", "Иванович", "Сидоров");
        doReturn(fullName).when(authorList).addAuthor(strName);
//        doReturn(fullName).when(authorList).addAuthor(strName);
    }

}

package de.neuefische.bo231myfirstspring.service;

import de.neuefische.bo231myfirstspring.repository.GreetingsRepo;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GreetingsServiceTest {

    GreetingsRepo repo = mock(GreetingsRepo.class);
    GreetingsService service = new GreetingsService(repo);

    @Test
    void greetCustomer() {
        //GIVEN
        String id = "2";
        String userName = "Test";
        //WHEN
        when(repo.getGreeting(any())).thenReturn("Hey");
        String actual = service.greetCustomer(id,userName);
        //THEN
        assertEquals("Hey Test", actual);
        verify(repo).getGreeting(id);
    }
}
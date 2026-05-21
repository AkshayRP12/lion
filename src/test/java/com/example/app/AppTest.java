package com.example.app;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddEmployee(){

        List<String> list = new ArrayList<>();

        list = App.addEmployee(list,"Koushik");

        assertEquals(1, list.size());
    }

    @Test
    public void testEmployeeCount(){

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");

        assertEquals(2,
        App.getEmployeeCount(list));
    }
}

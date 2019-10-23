package Test_ToDoList;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;

//public class TestTask {
    // @Test
    //public int addNumber(int a, int b){
        // return a+b;
   // }
//}
import main.app.*;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ToDoListTest {

    private ToDoList toDoList;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void init() {
        toDoList = new ToDoList();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void convertStringToDateTestNegative() {
        toDoList.convertStringToDate("12-13-2019");

        String expected = "Invalid date. Please try again.";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void convertStringToDateTestPositive() {
        toDoList.convertStringToDate("13-12-2019");

        String expected = "2019-12-13";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

}





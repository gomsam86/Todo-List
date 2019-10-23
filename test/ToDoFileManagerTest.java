//package Test_ToDoList;
package main.app;


import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoFileManagerTest {

    ToDoList toDoList = new ToDoList();
    String projectName = "project1";
    String taskName = "task1";
    LocalDate taskDate = toDoList.convertStringToDate("23-10-2019");
    String taskStatus = "done";
    String taskDescription = "Project1 has one task";

    TaskItem taskItem1 = new TaskItem(projectName, taskName, taskDescription, taskDate, taskStatus);
    List<TaskItem> taskItemList = toDoList.getList();
    String fileName = "ToDoListTest/ToDoTestFile.txt";
    ToDoFileManager toDoFileManager = new ToDoFileManager();

    @Test
    public void writeToFileTest() {

        taskItemList.add(taskItem1);     // Write testItem1 to file
        boolean testResult = ToDoFileManager.writeToFile(fileName, taskItemList);       // writeToFile method is static
        assertTrue(testResult);         // Assert that the write was a success

    }

    @Test
    public void readFromFileTest() {
        List<TaskItem> testResult = toDoFileManager.ReadFromFile(fileName);
        System.out.println(testResult);
        assertTrue(testResult.get(0).equals(taskItem1) );

    }
}
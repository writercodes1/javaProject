package Service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentServiceText {

    @Test  
    public void testisSubscribed(){  
        assertEquals(false,StudentService.isSubscribed("4"));  
        assertEquals( null,StudentService. findStudent("1"));  
    }  
} 
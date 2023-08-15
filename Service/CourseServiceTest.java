package Service;



 

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseServiceTest {

    @Test  
    public void testisSubscribed(){  
       
        assertEquals( null,CourseService.getCourse("11"));  
    }  
} 
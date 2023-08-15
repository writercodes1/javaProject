package Service;

 

import Model.Course;
import Model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class package Service;

 

import Model.Course;
import Model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private static final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public static  Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public static boolean isSubscribed( String studentId )
    {
    	if(findStudent(studentId)!=null) {
    		return true;
    	}
        return false;
    }

    public void showSummary()
    {

        System.out.println( "Available Student:" );
     
        for(Map.Entry<String,Student>e :students.entrySet()) {
        	System.out.println(e.getValue());
        }  
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}

{
    private static final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public static  Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public static boolean isSubscribed( String studentId )
    {
    	if(findStudent(studentId)!=null) {
    		return true;
    	}
        return false;
    }

    public void showSummary()
    {

        System.out.println( "Available Student:" );
     
        for(Map.Entry<String,Student>e :students.entrySet()) {
        	System.out.println(e.getValue());
        }  
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}

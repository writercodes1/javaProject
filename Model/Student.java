package Model;

 


import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Service.CourseService;
public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
    	
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
    	
    	courses.add(course);
        //TODO implement this method
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {
         if(approvedCourses.containsKey(courseCode)) {
        	 return true;
         }
        return false;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
         
        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
    	   for(Course cc: courses) {
    		   if(cc.getCode()==courseCode)
    		   return true;
    	   }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
    	List<Course>aa =new ArrayList();
    	for(Map.Entry<String,Course> entry:approvedCourses.entrySet()){   
    	aa.add(entry.getValue() );}
    	return aa;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}


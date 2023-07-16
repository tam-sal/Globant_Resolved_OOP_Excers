/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13prof.services;

import java.util.Scanner;
import practica13prof.entities.Course;

/**
 *
 * @author blue_
 */
public class CourseServices {

    private final Course c = new Course();
    private final Scanner _input = new Scanner(System.in).useDelimiter("\n");

    public Course createCourse() {

        System.out.println("Enter course title");
        c.setCourseTitle(_input.next());
        System.out.println("Course hours per day");
        c.setHoursPerDay(_input.nextInt());
        System.out.println("Course days per week");
        c.setDaysPerWeek(_input.nextInt());
        System.out.println("Enter shift schedule: [day | night]");
        String shift = _input.next();
        while (!(shift.equalsIgnoreCase("day") || shift.equalsIgnoreCase("night"))) {
            System.out.println("Shift must be 'day' or 'night' ");
            shift = _input.next();
        }
        c.setShift(shift);
        System.out.println("Price per hour");
        c.setPricePerHour(_input.nextDouble());
        System.out.println("How many student are enrolled in this course? [5 max]");
        int count = _input.nextInt();
        while (count > 5 || count < 1) {
            System.out.println("Count must be in range [1:5]. Enter a new count");
            count = _input.nextInt();
        }
        c.setStudents(new String[count]);
        
        for (int i = 0; i < c.getStudents().length; i++) {
            int j = i + 1;
            System.out.println("Enter student n°: "+j);
            loadStudent(_input.next(),i);
        }
        
        return c;
    }

    void loadStudent(String st, int i) {    
            c.getStudents()[i] = st;
    }
    
    public double getWeeklyEarnings(){
        return c.getHoursPerDay() * c.getPricePerHour() * c.getStudents().length * c.getDaysPerWeek();
    }

}

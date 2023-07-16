/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13prof.entities;

import java.util.Arrays;

/**
 *
 * @author blue_
 */
public class Course {
    private String _courseTitle;
    private int _hoursPerDay;
    private int _daysPerWeek;
    private String _shift;
    private double _pricePerHour;
    private String[] _students;

    public Course() {
    }

    public Course(String _courseTitle, int _hoursPerDay, int _daysPerWeek, String _shift, double _pricePerHour, String[] _students) {
        this._courseTitle = _courseTitle;
        this._hoursPerDay = _hoursPerDay;
        this._daysPerWeek = _daysPerWeek;
        if(!_shift.equalsIgnoreCase("day") || !_shift.equalsIgnoreCase("night")){
            throw new Error("Invalid shift data");
        }
        this._shift = _shift;
        this._pricePerHour = _pricePerHour;
        _students = new String[5];
        this._students = _students;
    }

    public String getCourseTitle() {
        return _courseTitle;
    }

    public int getHoursPerDay() {
        return _hoursPerDay;
    }

    public int getDaysPerWeek() {
        return _daysPerWeek;
    }

    public String getShift() {
        return _shift;
    }

    public double getPricePerHour() {
        return _pricePerHour;
    }

    public String[] getStudents() {
        return _students;
    }

    public void setCourseTitle(String _courseTitle) {
        this._courseTitle = _courseTitle;
    }

    public void setHoursPerDay(int _hoursPerDay) {
        this._hoursPerDay = _hoursPerDay;
    }

    public void setDaysPerWeek(int _daysPerWeek) {
        this._daysPerWeek = _daysPerWeek;
    }

    public void setShift(String _shift) {
        this._shift = _shift;
    }

    public void setPricePerHour(double _pricePerHour) {
        this._pricePerHour = _pricePerHour;
    }

    public void setStudents(String[] _students) {
        this._students = _students;
    }

    @Override
    public String toString() {
        return "Course{" + "courseTitle=" + _courseTitle + ", hoursPerDay=" + _hoursPerDay + ", daysPerWeek=" + _daysPerWeek + ", shift=" + _shift + ", pricePerHour=" + _pricePerHour + ", students=" + Arrays.toString(_students) + '}';
    }
        
}

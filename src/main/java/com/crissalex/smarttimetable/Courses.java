package com.crissalex.smarttimetable;

public class Courses {
    String CourseId;
    String Coursename;
    public Courses(){
    }
    public Courses(String CourseId , String Coursename){

        this.CourseId = CourseId;
        this.Coursename = Coursename;
    }

    public String getCourseId() {
        return CourseId;
    }

    public String getCoursename() {
        return Coursename;
    }
}

}

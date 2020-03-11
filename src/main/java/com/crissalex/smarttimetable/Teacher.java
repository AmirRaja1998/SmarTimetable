package com.crissalex.smarttimetable;

public class Teacher {
    String TeacherId;
    String Teachername;
    public Teacher(){
    }
    public Teacher(String TeacherId , String Teachername){

        this.TeacherId = TeacherId;
        this.Teachername = Teachername;
    }

    public String getTeacherId() {
        return TeacherId;
    }

    public String getTeachername() {
        return Teachername;
    }
}

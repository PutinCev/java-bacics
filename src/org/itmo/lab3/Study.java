package org.itmo.lab3;

public class Study {
    private String course;

    public Study(){
        course = "Изучение Java - это просто!";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }

}




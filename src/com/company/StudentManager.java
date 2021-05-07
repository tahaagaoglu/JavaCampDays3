package com.company;

public class StudentManager
{
    public void coursesAdded(Student student)
    {
        System.out.println(student.firstName+":"+student.studentCourses+" kurs eklenmiştir");
    }

    public void coursesDelete(Student student)
    {
        System.out.println(student.firstName+":"+student.studentCourses+"kurs silinmiştir");
    }
}

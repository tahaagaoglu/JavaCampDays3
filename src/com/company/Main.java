package com.company;

public class Main {

    public static void main(String[] args)
    {

        Instructor instructor1=new Instructor();
        instructor1.id=1;
        instructor1.firstName="Ali";
        instructor1.lastName="Demirog";
        instructor1.email="engin.1@gmail.com";
        instructor1.password="1234";
        instructor1.instructorCourses="C#";


        Student student1=new Student();
        student1.id=1;
        student1.firstName="Cengiz";
        student1.lastName="Hanlı";
        student1.email="cengiz.61@gmail.com";
        student1.password="10920";
        student1.studentCourses="Java";

        System.out.println(instructor1.firstName);

        UserManager userManager=new UserManager();
        userManager.add(instructor1);
        userManager.add(student1);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.instructorCoursesAdded(instructor1);
        instructorManager.instructorCoursesDelete(instructor1);

        StudentManager studentManager =new StudentManager();
        studentManager.coursesAdded(student1);



    }
}

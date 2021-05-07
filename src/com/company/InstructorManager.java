package com.company;

public class InstructorManager
{
    public void instructorCoursesAdded(Instructor instructor)
    {
        System.out.println(instructor.instructorCourses+ "Kursu sisteme eklendi");
    }

    public void instructorCoursesDelete(Instructor instructor)
    {
        System.out.println(instructor.instructorCourses+ "Kursu sistemden silindi");
    }

    public void instructorCoursesUpdate(Instructor instructor)
    {
        System.out.println(instructor.instructorCourses+ "Kursu güncellendi");
    }
}

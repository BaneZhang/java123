package com.javaeasy.genericstypes;

import java.util.ArrayList;
import java.util.List;
import com.javaeasy.compare.Student;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 11:17
 */
public class NoGenericsTypes {
    public static void printStudentProps(Student stu) {
        System.out.println("学生姓名：" + stu.getName());
        System.out.println("学生编号：" + stu.getNumber());
    }

    public static void main(String[] args) {
        Student student = new Student("刘伟", 1);
        List<Student> students = new ArrayList<Student>();
        students.add(student);
        Student student1 = students.get(0);
        printStudentProps(student1);
    }
}

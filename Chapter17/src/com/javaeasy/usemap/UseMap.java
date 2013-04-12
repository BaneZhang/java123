package com.javaeasy.usemap;

import com.javaeasy.compare.Student;
import com.javaeasy.genericstypes.NoGenericsTypes;
import java.util.Map;
import java.util.HashMap;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 11:49
 */
public class UseMap {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<String, Student>();
        Student stu1 = new Student("刘伟", 1);
        Student stu2 = new Student("成秋", 2);
        students.put(stu1.getName(), stu1);
        students.put(stu2.getName(), stu2);
        Student findStu = students.get("成秋");
        NoGenericsTypes.printStudentProps(findStu);
    }
}

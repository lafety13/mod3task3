package task3;

import java.util.Date;

/**
 * Created by vadim on 11.11.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        Course course1 = new Course(date, "Vadim");
        Course course2 = new Course(date, "Sveta");
        Course course3 = new Course(date, "Ivan");
        Course course4 = new Course(22, "Vadim", "Ivan");
        Course course5 = new Course(321, "Inna", "John");


        Course[] courses = {course1};
        Student student1 = new Student("Vadim", "Kozak", 1);
        Student student2 = new Student("Kozak", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Ivan", "Ivanov", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("Kozak", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent(123123, "BBC", 123);

        SpecialStudent specialStudent1 = new SpecialStudent("Ivan", "Ivanov", 2);
        SpecialStudent specialStudent2 = new SpecialStudent("Kozak", courses);
        SpecialStudent specialStudent3 = new SpecialStudent(56434567432L);
    }
}

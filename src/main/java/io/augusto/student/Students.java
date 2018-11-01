package io.augusto.student;

import io.augusto.Subject.Subject;

import java.util.*;
import java.util.stream.Collectors;

public class Students {

    private static List<Student> students = new ArrayList<>();
    static {

        Student student1 = Student.with(s -> s
                .id("stdn1")
                .name("Juan Perez")
                .email("juan.perez@mail.com")
                .age(18)
                .subject(Subject.subNamed("science"))
                .subject(Subject.subNamed("music")));

        Student student2 = Student.with(s -> s
                .id("stdn2")
                .name("Pepe Perez")
                .email("pepe.perez@mail.com")
                .age(19)
                .subject(Subject.subNamed("science"))
                .subject(Subject.subNamed("music")));

        Student student3 = Student.with(s -> s
                .id("stdn3")
                .name("Pablo Lopez")
                .email("pablo.lopez@mail.com")
                .age(19)
                .subject(Subject.subNamed("MATH"))
                .subject(Subject.subNamed("socialstudies")));

        Student student4 = Student.with(s -> s
                .id("stdn4")
                .name("Jose Lopez")
                .email("jose.lopez@mail.com")
                .age(19)
                .subject(Subject.subNamed("MATH"))
                .subject(Subject.subNamed("socialstudies")));

        Student student5 = Student.with(s -> s
                .id("stdn5")
                .name("Maria Rios")
                .email("maria.rios@mail.com")
                .age(20)
                .subject(Subject.subNamed("MATH"))
                .subject(Subject.subNamed("socialstudies")));

        Student student6 = Student.with(s -> s
                .id("stdn6")
                .name("Juana Fuentes")
                .email("juana.fuentes@mail.com")
                .age(21)
                .subject(Subject.subNamed("MATH"))
                .subject(Subject.subNamed("socialstudies")));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
    }

    public static List<Student> defaultStudents() {
        return new ArrayList<>(students);
    }

    public void
    addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }
}

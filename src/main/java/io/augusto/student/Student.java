package io.augusto.student;

import io.augusto.Subject.Subject;

import java.util.*;
import java.util.function.Consumer;

public class Student implements Catalog {

    private String id;
    private String name;
    private String email;
    private int age;
    private Set<Subject> subjects = new HashSet<>();

    private Student() {
    }

    //Factory method pattern.
    public static Student with(Consumer<Student> block) {
        Student student = new Student();
        block.accept(student);
        return student;
    }

    //---------- Emulating builder pattern using Consumer --------
    public Student id(String id) {
        this.id = id;
        return this;
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public Student age(int age) {
        this.age = age;
        return this;
    }

    public Student subjects(Set<Subject> subjects) {
        this.subjects.addAll(subjects);
        return this;
    }

    public Student subject(Subject subject) {
        if (null != subject) {
            this.subjects.add(subject);
        }
        return this;
    }

    public Student email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String getKey() {
        return this.id;
    }

    @Override
    public String getValue() {
        return this.name;
    }

    //---------- Only getter methods --------

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Set<Subject> getSubjects() {
        return new HashSet<>(subjects);
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}

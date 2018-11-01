package io.augusto.ddeclarative;

import io.augusto.student.Student;
import io.augusto.student.Students;

import java.util.Arrays;
import java.util.List;

import static com.sun.deploy.trace.Trace.print;

public class DeclarativeCode {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Print the sum of numbers using for. Imperative :(
        int sum1 = 0;
        for (Integer i : numbers) {
            sum1 += i;
        }
        System.out.println("sum1" + sum1);

        //Print the sum of numbers using reduce :)
        Integer sum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        //Print the sum of numbers using sum() on int estreams. Functional and Declarative
        numbers.stream()
                .mapToInt(e -> e)
                .sum();
        List<Student> students = Students.defaultStudents();

        //Option1 - for
        for (int i = 1; i < students.size(); i++) {
            print(students.get(i).getName());
        }

        //Option2 - for each
        for (Student student : students) {
            print(student.getName());
        }

        //Option3 - forEach() on stream
        students.stream()
                .map(Student::getName)
                .forEach(DeclarativeCode::print);

        //Option4 - forEach() on Collection
        students.forEach(student -> print(student.getName()));












    }

    private static void print(String text) {
        System.out.println(text);
    }

}

/*1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.*/
package student_Tigran_Poghosyan.javaClasses.mainTask1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SortStudents {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Student tigranPoghosyan = new Student("Tigran", "Poghosyan", simpleDateFormat.parse("03/03/1988"),
                "economic", 4, 1);
        Student tigranPetrosyan = new Student("Tigran", "Petrosyan", simpleDateFormat.parse("05/04/1989"),
                "vt", 3, 1);
        Student armenDallaqyan = new Student("armen", "Dallaqyan", simpleDateFormat.parse("05/04/1990"),
                "radio", 3, 1);
        Student artakSimonyan = new Student("Artak", "Simonyan", simpleDateFormat.parse("05/04/1991"),
                "radio", 2, 2);
        Student hakobVardanyan = new Student("Hakob", "Vardanyan", "Armeni", simpleDateFormat.parse("05/04/1990"),
                "Goris", "099008070", "radio", 1, 1);

        Student[] students = tigranPetrosyan.createStudentsList(tigranPetrosyan, tigranPoghosyan, armenDallaqyan, artakSimonyan, hakobVardanyan);

        System.out.println("Radio facultet students list");
        for (Student sort : students) {                        //task a
            if (sort.getFaculty() == "Radio") {
                System.out.println(sort.toString());
            }
        }

        System.out.println();    //task c Sort by Birthday
        System.out.println("list of students born after 1989");
        for (Student sort : students) {
            if (sort.getBirthDay().after(simpleDateFormat.parse("05/04/1989"))) {
                System.out.println(sort.toString());
            }
        }


        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            boolean thereAreChanges = false;
            for (int i = 0; i < students.length - 1; i++) {
                Student saveFirstPoint;
                String firstLetter = students[i].getFaculty();
                if (students[i].getFaculty().charAt(0) > students[i + 1].getFaculty().charAt(0)) {
                    saveFirstPoint = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = saveFirstPoint;
                    thereAreChanges = true;
                }
            }
            if (thereAreChanges) {
                sorted = false;
            }

        }
        System.out.println();
        System.out.println("sort all students by faculity");
        for (Student x : students
        ) {
            System.out.println(x.getFaculty() + " course " + x.getCourse() + " group " + x.getGroup());

        }

    }
}


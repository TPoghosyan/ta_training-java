package HomeWork180321;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SortStudents {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Student tigranPoghosyan = new Student("Tigran", "Poghosyan", simpleDateFormat.parse("03/03/1988"),
                "Radio", 4, 1,1);
        Student tigranPetrosyan = new Student("Tigran", "Petrosyan", simpleDateFormat.parse("05/04/1989"),
                "VT", 3, 1,2);
        Student armenDallaqyan = new Student("armen", "Dallaqyan", simpleDateFormat.parse("05/04/1990"),
                "Radio", 2, 1,3);
        Student artakSimonyan = new Student("Artak", "Simonyan", simpleDateFormat.parse("05/04/1991"),
                "Radio", 1, 2,4);
        Student hakobVardanyan = new Student("Hakob", "Vardanyan", "Armeni", simpleDateFormat.parse("05/04/1990"),
                "Goris", "099008070", "economics", 2, 1,5);

        Student[] students = tigranPetrosyan.createStudentsList(tigranPetrosyan, tigranPoghosyan, armenDallaqyan, artakSimonyan, hakobVardanyan);

        System.out.println("Radio facultet students list");
        for (Student sort : students) {                        //task a
            if (sort.getFaculty() == "Radio") {
                System.out.println(sort.toString());
            }
        }

        System.out.println();    //task c
        System.out.println("list of students born after 1989");
        for (Student sort : students) {
            if (sort.getBirthDay().after(simpleDateFormat.parse("05/04/1989"))) {
                System.out.println(sort.toString());
            }
        }


    }
}


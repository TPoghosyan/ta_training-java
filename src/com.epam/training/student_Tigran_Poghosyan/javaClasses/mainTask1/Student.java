package student_Tigran_Poghosyan.javaClasses.mainTask1;/*Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString()
. Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести
эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 */

import java.text.ParseException;
import java.util.Date;

public class Student {
    private  static int num =0;
    private  int idNumber = 0;
    private String name;
    private String surName;
    private String fatherLand;
    private Date birthDay;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student(String name, String surName, String fatherLand, Date birthDay, String adress, String phoneNumber, String faculty, int course, int group) throws ParseException {
        this.idNumber = num++;
        this.name = name;
        this.surName = surName;
        this.fatherLand = fatherLand;
        this.birthDay = birthDay;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surName, Date birthDay, String adress, String phoneNumber, String faculty, int course, int group) throws ParseException {
        this.idNumber = num++;
        this.name = name;
        this.surName = surName;
        this.fatherLand = "";
        this.birthDay = birthDay;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surName, Date birthDay, String phoneNumber, String faculty, int course, int group) throws ParseException {
        this.idNumber = num++;
        this.name = name;
        this.surName = surName;
        this.fatherLand = "";
        this.birthDay = birthDay;
        this.address = "";
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surName, Date birthDay, String faculty, int course, int group) throws ParseException {
        this.idNumber = num++;
        this.name = name;
        this.surName = surName;
        this.fatherLand = "";
        this.birthDay = birthDay;
        this.address = "";
        this.phoneNumber = "";
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surName, String faculty, int course, int group) throws ParseException {
        this.idNumber = num++;
        this.name = name;
        this.surName = surName;
        this.fatherLand = "";
        this.birthDay = new Date(00, 00, 01);
        this.address = "";
        this.phoneNumber = "";
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFatherLand() {
        return fatherLand;
    }

    public void setFatherLand(String fatherLand) {
        this.fatherLand = fatherLand;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ",  " + name + "" +
                ",  " + surName + "" +
                ",  " + fatherLand + "" +
                ",  " + birthDay +
                ", adress=" + address + "" +
                ",  " + phoneNumber + "" +
                ", faculity='" + faculty + "'" +
                ", course='" + course + "'" +
                ", group='" + group + "'" +
                '}';
    }

    Student[] createStudentsList(Student... students) {
        return students;
    }
}






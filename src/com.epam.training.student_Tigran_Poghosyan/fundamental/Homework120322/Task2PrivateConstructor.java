package Homework120322;

public class Task2PrivateConstructor {
    public static void main(String[] args) {
        PrivateClass privateClass = PrivateClass.makePrivateClass();
        System.out.println(privateClass.getExam());

    }
}

class PrivateClass  {
    private int exam = 5;


    private PrivateClass() {
        System.out.println("object is created");

    }

    public static PrivateClass makePrivateClass() {
        return new PrivateClass();
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }
}

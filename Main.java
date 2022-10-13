package j101;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Kaan","TRH","9012123213211");
        Teacher t2 = new Teacher("Faik","FZK","010102030201");
        Teacher t3 = new Teacher("Emin","KMY","29372101823");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik  = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya","101","KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Kadan","123","4", tarih,fizik,kimya);
        s1.addBulkExamNote(60,70,80);
        s1.isPass();

        Student s2 = new Student("Levent","231","4",tarih,fizik,kimya);
        s2.addBulkExamNote(70,85,24);
        s2.isPass();



    }
}

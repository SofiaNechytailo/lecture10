public class Main {
    public static void main(String[] args) {
     Student student = new Student();
     student.setName("Sofiia");
     student.setSurname("Nechytailo");
     student.setAge(21);
     Teacher teacher = new Teacher();
     teacher.setName("Sergiy");
     teacher.setSurname("Zhuravlev");
     teacher.setAge(26);
     teacher.setStudent(student);
    }
}
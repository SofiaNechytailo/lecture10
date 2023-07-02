public class Teacher {
    private String name;
    private String surname;
    private int age;
    private Student student;
    public void setStudent ( Student student){
        this.student =student;
    }
    public Student getStudent (){
        return this.student;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
    public void setSurname (String surname){
        this.surname = surname;
    }
    public String getSurname (){
        return this.surname;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge (){
        return this.age;
    }
}

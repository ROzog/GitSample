public class Kuba {
    private String name;
    private String surname;
    private int age;

    public Kuba(String name, String surname, int age){
        this.age = age;
        this.name = name;
        this.surname = surname;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }
}
import java.util.Objects;

public class Robert {
    String name;
    int age;

    public Robert(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robert robert = (Robert) o;
        return age == robert.age &&
                Objects.equals(name, robert.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

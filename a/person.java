import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // To display the object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

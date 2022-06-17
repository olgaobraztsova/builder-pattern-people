import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private String city;

    public Person() {

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }


    public void setAddress(String address) {
        this.city = address;
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return "[Name]: " + name +
                "\n[Surname]: " + surname +
                "\n[Age]: " + age +
                "\n[City]: " + city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.city);
    }

}

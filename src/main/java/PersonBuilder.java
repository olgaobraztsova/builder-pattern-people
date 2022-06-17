import java.util.OptionalInt;

public class PersonBuilder {

    private String name;
    private String surname;
    private Integer age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        if (name != null && surname != null) {
            if (age == null) {
                return new Person(name, surname, city);
            } else if (age > 0) {
                return new Person(name, surname, age, city);

            }
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        throw new IllegalStateException("Не введен один из обязательных параметров");
    }


}

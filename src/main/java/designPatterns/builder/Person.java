package designPatterns.builder;

import java.util.Objects;

public class Person {

    private String name;
   private String lastName;
   private int age;
   private  String hair;
   private int height;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;

        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getHair() {
        return hair;
    }

    public Person makeHair(String hair) {
        this.hair = hair;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Person setHeight(int height) {
        this.height = height;
        return this;
    }

    public Person build(){
        Person person = new Person();
        person.name = this.name;
        person.lastName = this.lastName;
        person.age = this.age;
        person.height = this.height;
        person.hair = this.hair;

        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", hair = '" + hair + '\'' +
                ", height = " + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }
}

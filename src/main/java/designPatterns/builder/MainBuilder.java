package designPatterns.builder;

public class MainBuilder {


    public static void main(String[] args) {
        Person person = new Person();

        person
                .setName("Zosia")
                .setLastName("Samosia")
                .setHeight(155)
                .setAge(15)
                .makeHair("blond")
                .build();


    }
}

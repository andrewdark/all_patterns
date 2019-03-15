package ua.pp.darknsoft;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final int height;
    private final int weight;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public static class Builder {
        // Required parameters
        private final String firstName;
        // Optional parameters - initialized to default values
        private String lastName = "";
        private int age = 0;
        private int height = 0;
        private int weight = 0;

        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder withWeith(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

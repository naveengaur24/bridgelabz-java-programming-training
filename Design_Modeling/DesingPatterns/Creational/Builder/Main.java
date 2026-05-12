package Design_Modeling.DesingPatterns.Creational.Builder;

class Student {

    // final fields -> object immutable ban gaya
    private final int id;
    private final String name;
    private final String city;

    // private constructor
    //yaha ye constructor directly values ko set nhi kr ra..builder class ke through values set kr raha hai..builder ke ander jo values stored thi wo constructor ke ander set ho rahi hai..
    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.city = builder.city;
    }

    // to print object
    public String toString() {
        return id + " " + name + " " + city;
    }

    // Builder Class
    static class Builder {

        private int id;
        private String name;
        private String city;

        public Builder setId(int id) {
            this.id = id;
            return this;   // method chaining ke liye return this karna padta hai, jisse hum ek sath multiple setter methods ko call kar sakte hai..agar return this nhi karenge toh method chaining possible nhi hogi aur hume har setter method ke baad alag se object create karna padega..
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        // final object create
        public Student build() {
            return new Student(this);   // this ka matlab hai current builder object, jisme id, name aur city ki values stored hai..ye values constructor ke ander set ho jayengi aur final student object create ho jayega..
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student.Builder()
                        .setId(101)
                        .setName("Naveen")
                        .setCity("Meerut")
                        .build();

        System.out.println(s);
    }
}
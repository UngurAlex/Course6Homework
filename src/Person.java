public class Person {
    String name;
    Integer age;
    String married;

    String getNameAgeMarried() {
        return name + age + married;
    }

    Person(String getName, int getAge, String isMarried) {
        name = getName;
        age = getAge;
        married = isMarried;
    }

}

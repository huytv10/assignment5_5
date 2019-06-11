public class Student extends Person {
    public Student() {

    }

    public Student(String a, int b, String c) {
        super(a, b, c);
    }

    public boolean is18(Person person) {
        if (person.getTuoi() == 18)
            return true;
        return false;
    }
}

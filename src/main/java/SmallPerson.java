public class SmallPerson extends Person{
    public SmallPerson() {
    }

    public SmallPerson(String name, int idNum, int age, double wage, int numset) {
        super(name, idNum, age, wage, numset);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}

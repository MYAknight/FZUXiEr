public abstract class Cat {
    protected String name;
    protected int age;
    protected int gender;
    protected double price;

    public Cat() {

    }

    public Cat(String name, int age, int gender, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", price=" + price +
                '}';
    }
}

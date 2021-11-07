public class BlackCat extends Cat {
    public BlackCat(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = 350;
    }

    public BlackCat(String name, int age, int gender, double price) {
        super(name, age, gender, price);
    }
}

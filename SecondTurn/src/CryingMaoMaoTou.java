public class CryingMaoMaoTou extends Cat {

    public CryingMaoMaoTou() {

    }

    public CryingMaoMaoTou(String name, int age, int gender, double price) {
        super(name, age, gender, price);
    }

    public CryingMaoMaoTou(String name, int age, int gender) {
        this.price = 1000;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

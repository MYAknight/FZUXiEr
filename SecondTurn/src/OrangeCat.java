public class OrangeCat extends Cat {
    boolean isFat;

    public OrangeCat(String name, int age, int gender, double price, boolean isFat) {
        super(name, age, gender, price);
        this.isFat = isFat;
    }

    public OrangeCat(String name, int age, int gender, boolean isFat) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = 200;
        this.isFat = isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }

    public boolean isFat() {
        return isFat;
    }
}

import java.time.LocalDate;

public class Customer {
    String name;
    int rua;
    LocalDate time;

    public Customer(String name, int rua) {
        this.name = name;
        this.rua = rua;
        time = LocalDate.now();
    }


    @Override
    public String toString() {
        return "Customer信息{" +
                "name='" + name + '\'' +
                ", rua=" + rua +
                ", time=" + time +
                '}';
    }

}

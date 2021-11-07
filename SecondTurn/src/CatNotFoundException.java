import java.time.LocalDate;

public class CatNotFoundException extends RuntimeException {
    LocalDate time;
    public CatNotFoundException(LocalDate time) {
        System.out.println("没猫了啊");
        this.time = time;
    }

    public LocalDate getTime() {
        return time;
    }
}

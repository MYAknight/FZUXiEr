import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList();
        List<Customer> customerList = new ArrayList();
        Customer s1mple = new Customer("s1mple",1);
        Customer faker = new Customer("faker",2);
        Customer lbw = new Customer("lbw",1);
        Customer theshy = new Customer("theshy",1);
//        MyCatCafe myCatCafe = new MyCatCafe(0, catList, customerList); // 没钱会报InsufficientFundsException
        MyCatCafe myCatCafe = new MyCatCafe(2000, catList, customerList);
        myCatCafe.buyCat("asd","aa",12,1);  //错误的输入例
//        myCatCafe.serveCustomer(xiaohu);      //如果没猫会报CatNotFoundException
        myCatCafe.buyCat("OrangeCat","aa",12,1);
        myCatCafe.buyCat("BlackCat","bb",2,0);
        myCatCafe.buyCat("BlackCat","cc",3,1);
        myCatCafe.buyCat("BlackCat","dd",4,0);
        myCatCafe.buyCat("BlackCat","ee",5,1);
        myCatCafe.serveCustomer(s1mple);        //随机选择五个猫
        myCatCafe.serveCustomer(faker);        //随机选择五个猫，faker会rua两次
        myCatCafe.serveCustomer(lbw);        //随机选择五个猫
        myCatCafe.serveCustomer(theshy);        //随机选择五个猫
        myCatCafe.closeDoor();              //正常来讲因为每天都是在同一天发生的所以并不会关门的，
        myCatCafe.closeDoor(LocalDate.now());              //所以我重写了一个方法让输出当天现有的顾客
    }
}

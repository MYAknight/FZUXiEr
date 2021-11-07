import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyCatCafe implements CatCafe {

    double money;
     List<Cat> catList = new ArrayList();
     List<Customer> customerList = new ArrayList();

    public MyCatCafe(double money, List<Cat> catList, List<Customer> customerList) {
        this.money = money;
        this.catList = catList;
        this.customerList = customerList;
    }

    @Override
    public void buyCat(String species, String name, int age, int gender) {
        if ("BlackCat".equals(species)) {
            if (money - 350 >= 0) {
                money -= 350;
                catList.add(new BlackCat(name, age, gender));
            } else
                throw new InsufficientFundsException(money);
        } else if ("OrangeCat".equals(species)) {
            if (money - 350 >= 0) {
                money -= 350;
                catList.add(new OrangeCat(name, age, gender,true));
            } else
                throw new InsufficientFundsException(money);
        } else if ("CryingMaoMaoTou".equals(species)) {
            if (money - 350 >= 0) {
                money -= 350;
                catList.add(new CryingMaoMaoTou(name, age, gender));
            } else
                throw new InsufficientFundsException(money);
        } else {
            System.out.println("你这猫有问题啊，重新输入吧");
        }
    }

    @Override
    public void serveCustomer(Customer customer) {
        if (catList.isEmpty()){
            throw new CatNotFoundException(customer.time);
        }else {
            for (int i = 0; i < customer.rua; i++) {
                money+=15;
                Random rand = new Random();
                int catIndex = rand.nextInt(catList.size());
                Cat c = catList.get(catIndex);
                System.out.println(c);
                customerList.add(customer);
            }
        }
    }

    @Override
    public void closeDoor() {
//        Instant instant = Instant.now();//这里用Instant可能会更合适吧，但是题目要用LocalDate类诶
        LocalDate ld = LocalDate.now();
        int income = 0;
        if (!ld.equals(customerList.get(0).time)){
            Iterator<Customer> it = customerList.iterator();
            while(it.hasNext()) {
                income+=15;
                System.out.println(it.next());
            }
        }
        System.out.println(income);
    }

    public void closeDoor(LocalDate lK) {
        LocalDate ld = LocalDate.now();
        int income = 0;
        if (ld.equals(customerList.get(0).time)){
            Iterator<Customer> it = customerList.iterator();
            while(it.hasNext()) {
                income+=15;
                System.out.println(it.next());
            }
            customerList.clear();//重置顾客链表，清空当天的所以顾客信息
        }
        System.out.println(income);
    }
}

public class InsufficientFundsException extends RuntimeException{
    private double lackMoney;
    public InsufficientFundsException(double lackMoney)
    {
        System.out.println("没钱能买猫吗，很蓝的啦，还差 "+(lackMoney-350));
        this.lackMoney = lackMoney;
    }
    public double getAmount()
    {
        return lackMoney;
    }
}

public class CheakEmail {
    public static void main(String[] args) {
        String st1 = "1862930922@qq.com";
        String st2 = "1862930922@qq";
        String st3 = "@qq.com";
        String st4 = "akua15963806286@163.com";
        System.out.println(checkValid(st1));
        System.out.println(checkValid(st2));
        System.out.println(checkValid(st3));
        System.out.println(checkValid(st4));
    }
    private static boolean checkValid(String address){
        return address.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9_-]+\\.com$");
    }
}

public class trycatch {
    public static void main(String[] args) {
        int a = 10; 
        int res = 0;
            res = a / 0;
            System.out.print(res);
        {
            System.out.println(res);
        }
    }
}
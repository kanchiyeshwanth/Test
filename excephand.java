public class excephand {
    public static void main(String[] args) {
        int a = 10; 
        int res = 0; 
        try {
            res = a / 0;
            System.out.print(res);
        } catch (Exception e) {
            System.out.println(res);
        }
    }
}
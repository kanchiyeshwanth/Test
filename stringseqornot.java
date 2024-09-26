public class stringseqornot {
    public static void main(String[] args) {
        String s1="ABCz";
        String s2="ABCz";
        int a=s1.length();
        int b=s2.length();
        if(a==b){
            System.out.println("Both lengths are same");
        }
        else{
            System.out.println("Both lengths are not");
        }
    }
}

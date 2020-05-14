
public class CheckEven{
    public static void main(String[] args) {
        System.out.println(checkEven(5));
        System.out.println(checkEven(6));
        System.out.println(checkEven(7));

    }

    public static boolean checkEven(int n){
        if(n%2==0)
            return true;
        return false;
    }
}

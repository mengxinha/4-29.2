public class Text {
    public static void main(String[] args) {

        int ret = func(123);
        System.out.println(ret);
    }
    public static int func(int n){
        if(n<10){
            return n;
        }
        int tem = n%10+func(n/10);
        return tem;
    }

}

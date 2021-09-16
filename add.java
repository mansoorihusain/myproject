import java.util.*;
class Sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0,r;
        while(n!=0){
            r = n%10;
            n = n/10;
            temp = temp+r;

        }
        System.out.println(temp);
        
    }

}
package Fibonacci;

public class Fibonacci {

    public void fibonacci() {
        int n1 = 0;
        int n2 = 1;
        int count = 20;
        System.out.print(n1 +" " + n2);

        for(int i = 2;i < count;++i)
        {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }
    }
}

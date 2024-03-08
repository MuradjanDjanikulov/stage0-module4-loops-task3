package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int viv1 = 0;
        int viv2 = 1;
        int sum=1;
        int num=1;
        System.out.println(viv1);
        for (int x = 2; x<=lastFibonacci; x++){
            System.out.println(sum);
            sum=viv1+viv2;
            viv1 = viv2;
            viv2 = sum;
        }
    }
}
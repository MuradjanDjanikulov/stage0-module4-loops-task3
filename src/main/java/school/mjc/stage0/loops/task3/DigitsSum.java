package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t<0){
            t=t*-1;}
        String plus = t + "";
        int sum = 0;
        int num = plus.length();
        for (int x = 1; x<=num; x++){
            sum+=t%10;
            t=t/10;
        }
        System.out.println(sum);

    }
}
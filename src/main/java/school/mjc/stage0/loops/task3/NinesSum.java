package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String plus = "";
        int sum = 0;
        for (int x = 1; x<=lengthOfLastNumber; x++){
            plus += 9;
            sum+=Integer.parseInt(plus);
        }
        System.out.println(sum);

    }
}
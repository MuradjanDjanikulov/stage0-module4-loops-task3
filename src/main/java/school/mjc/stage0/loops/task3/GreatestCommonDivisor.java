package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int res = 0;
        if (first==0){
            System.out.println(second);}
        else if (second==0){
            System.out.println(first);}
        else if (second>0 && first>0){
            for (int x = 1; x<=first && x<=second; x++){
                if(second%x==0 && first%x==0){
                    if(res<=x){
                        res=x;}}}System.out.println(res);}
    }
}
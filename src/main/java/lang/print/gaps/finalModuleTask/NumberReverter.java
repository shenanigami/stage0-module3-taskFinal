package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int magnitude = 1;
        int newNum = 0;
        while (number > 0) {
           newNum *= 10;
           newNum += number % 10;
           number /= 10;
        }
        System.out.println(newNum);
    }
}

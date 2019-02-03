package howManyLeapYearsFromCristmas;


public class Main {
    public static void main(String[] args) {


        System.out.println(howManyLeapYearsFromChristmas(100));
    }

    public static int howManyLeapYearsFromChristmas(int year){

        return year/4 - year/100 + year/400;
    }
}

class IEUsage {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0)
            System.out.println("num is bigger than 0");

        if ((num % 2 == 0))
            System.out.println("num is even");
        else
            System.out.println("num is odd");

        System.out.println("--------------------------------------");

        num = 120;
        if (num < 0) {
            System.out.println("num is smaller than 0");
        } else {
            if (num < 100) {
                System.out.println("num is smaller than 100");
            } else {
                System.out.println("num is bigger than 100");
            }
        }

        System.out.println("--------------------------------------");

        int num1 = 50, num2 = 100;
        int big, diff;

        big = (num1 > num2) ? num1 : num2;
        System.out.println(big);

        diff = (num1 > num2) ? num1 - num2 : num2 - num1;
        System.out.println(diff);
    }
}
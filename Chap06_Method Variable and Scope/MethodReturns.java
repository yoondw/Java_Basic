class MethodReturns {
    public static void main(String[] args) {
        int result = adder(4, 5);
        System.out.println("4 + 5 : " + result);
        System.out.println("3.5 ^ 2 : " + square(3.5));

        divide(4, 2);
        divide(6, 2);
        divide(9, 0);
    }

    public static int adder(int num1, int num2) {
        int addResult = num1 + num2;
        return addResult;
    }

    public static double square(double num) {
        return num * num;
    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Can't divide into zero");
            return;
        }
        System.out.println("Divide result : " + (num1 / num2));
    }
}
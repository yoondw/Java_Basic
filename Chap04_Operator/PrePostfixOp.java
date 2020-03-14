package Chap04_Operator;

class PrePostfixOp {
    public static void main(String[] args) {
        int num1 = 7;
        int num2, num3;

        num2 = ++num1;
        num3 = --num1;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        num1 = 7;
        num2 = 0;
        num3 = 0;

        num2 = num1++;
        num3 = num1--;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
package Chap04_Operator;

class SCE {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        boolean result;

        result = (num1 += 10) < 0 && (num2 += 10) > 0;
        System.out.println("result : " + result);
        System.out.println("num1 = " + num1 + " , num2 = " + num2);

        // num2 is still 0. Why?
        // by using && operator, we know that the left side of && is already false.
        // so whether &&'s right side is true or false, the result is always false.
        // so java don't do num2 += 10 task, so num2 remains 0.
        // SCE : Short-Circuit Evaluation(Lazy Evaluation)
    }
}
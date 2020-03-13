class MethodDefAdd {
    public static void main(String[] args) {
        System.out.println("Start of the program!");
        hiEveryone(12);
        hiEveryone(13);
        byEveryone();
        System.out.println("End of the program!");
    }

    public static void hiEveryone(int age) {
        System.out.println("Good Morning");
        System.out.println("My age is " + age + ".");
    }

    public static void byEveryone() {
        System.out.println("See you next time~");
    }
}
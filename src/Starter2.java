public class Starter2 {
    public static void main(String[] args) {
        int age =33;
        int age2 = 55;
        String name = "Tomasz";
        boolean prawda = true;
        int value =77;
        final double PI = 3.14;
        String city = "Krakow";
        System.out.println("dodałem");
        printText("nowa metodka");
        someText("hemoglobina taka sytuacja");
        System.out.println("hhhuiyutuuy oskar tu byl");

        printText("kolejny text");
        System.out.println("cos tam");
        System.out.println("awgagfa kuba");

    }

    public static void printText(String text) {
        System.out.println(text);
    }
    public static int add(int a, int b){
        return a+b;
    }

    public static void someText(String someText){
        System.out.println(someText);
    }

    public static double divide(double a, double b){
        return a/b;
    }
    public static String[] splittedArray(String text){
        return text.split(",");
    }

    Kuba kuba = new Kuba("Jakub","Modras", 99);





}

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println( w10and20(22, 32));
        System.out.println();
        positiveOrNot(-2);
        System.out.println();
        System.out.println(negative(-2));
        System.out.println();
        print("Hi!",3);
        System.out.println();
        System.out.println(visGod(2000));

    }

    public static boolean w10and20(int a, int b){
        return 10 >= (a + b) || (a + b) <= 20;
    }

    public static void positiveOrNot(int a){
        if (a >= 0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }

    public static boolean negative(int a){
        return a<0;
    }

    public static void print(String word, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(word);

        }
    }

    public static boolean visGod(int god){
        return god / 4 * 4 == god && god / 100 * 100 == god && god / 400 * 400 == god;

    }





}
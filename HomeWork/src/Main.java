public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До обмена: a = " + a + ", b = " + b);

        // Обмен значениями без использования третьей переменной
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена: a = " + a + ", b = " + b);
    }
}



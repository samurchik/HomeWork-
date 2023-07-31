public class WorldState {
    private boolean condition1;
    private boolean condition2;
    private boolean condition3;
    private boolean condition4;
    private boolean condition5;
    private boolean condition6;
    private boolean condition7;

    // Конструктор класса
    public WorldState(boolean c1, boolean c2, boolean c3, boolean c4, boolean c5, boolean c6, boolean c7) {
        condition1 = c1;
        condition2 = c2;
        condition3 = c3;
        condition4 = c4;
        condition5 = c5;
        condition6 = c6;
        condition7 = c7;
    }

    // Метод для определения состояния мира в негативном свете
    public boolean isWorldNegativelyGood() {
        return !condition1 || !condition2 || !condition3 || !condition4 || !condition5 || !condition6 || !condition7;
    }

    // Метод для определения состояния мира в позитивном свете
    public boolean isWorldPositivelyGood() {
        return condition1 && condition2 && condition3 && condition4 && condition5 && condition6 && condition7;
    }

    // Геттеры и сеттеры для переменных состояния мира можно добавить по необходимости
    public static void main(String[] args) {
        // Создание объекта класса WorldState
        WorldState world = new WorldState(true, true, false, true, false, false, true);

        // Проверка состояния мира в негативном свете
        boolean isNegativelyGood = world.isWorldNegativelyGood();
        System.out.println("Состояние мира в негативном свете: " + isNegativelyGood);

        // Проверка состояния мира в позитивном свете
        boolean isPositivelyGood = world.isWorldPositivelyGood();
        System.out.println("Состояние мира в позитивном свете: " + isPositivelyGood);
    }
}
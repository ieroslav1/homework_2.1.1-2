public class Main {

    public static void main(String[] args) {

        Human maxim = new Human(35, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human caterina = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27, "Артём", "Москва", "директор по развитию бизнеса");

        maxim.hello();
        anna.hello();
        caterina.hello();
        artem.hello();
    }
}
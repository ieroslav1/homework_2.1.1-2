public class Main {
    private static Flower[] flowers = new Flower[10];

    public static void main(String[] args) {

        Human maxim = new Human(1976, "Максим", "Минск", "бренд-менеджер");
        Human anna = new Human(1990, "Аня", null, "методист образовательных программ");
        Human caterina = new Human(1995, "Катя", "Калининград", null);
        Human artem = new Human(2001, null, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", null);

        maxim.hello();
        anna.hello();
        caterina.hello();
        artem.hello();

        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        flowers[0] = rose;
        flowers[1] = peony;
        flowers[2] = gypsophila;

        System.out.println();

        rose.printFlower();
        chrysanthemum.printFlower();
        peony.printFlower();
        gypsophila.printFlower();

        calcBouquet(flowers);
    }

    private static void calcBouquet(Flower[] flowers) {
        int lifeSpan = Integer.MAX_VALUE;
        double sum = 0;
        String text = "Букет состоит из ";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += " " + flowers[i].getName() + " " + " из" + flowers[i].getCountry() + "\n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10;
        text += "\n";
        text += "Стоимость букета " + String.format(" %.2f ", sum);
        text += "\n";
        text += "Срок стояния букета " + lifeSpan;
        System.out.println(text);
    }
}
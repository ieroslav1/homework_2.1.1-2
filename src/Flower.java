public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;

        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    void printFlower() {
        System.out.println(name + ", цвет " + flowerColor + ", " + country + ", " + cost + " рублей," +
                " срок стояния: " + lifeSpan + " д.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}

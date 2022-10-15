public class Human {

    int age;
    String name;
    String city;
    String jobTile;

    public Human(int age, String name, String city, String jobTitle) {
        this.age = age;
        this.name = name;
        this.city = city;
        this.jobTile = jobTitle;
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ", мне " + age +
                " лет. Работаю на должности " + jobTile + ". Будем знакомы!");
    }
}

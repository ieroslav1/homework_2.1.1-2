import java.time.LocalDate;
import java.util.Objects;

public class Human {

    private int birthYear;
    private String name;
    private String city;
    private String jobTitle;

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 0) {
            this.birthYear = LocalDate.now().getYear() - birthYear;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(birthYear);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "(информация не указана)";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) {
            this.city = "(информация не указана)";
        } else {
            this.city = city;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null) {
            this.jobTitle = "(информация не указана)";
        } else {
            this.jobTitle = jobTitle;
        }
    }

/*    public Human(int birthYear, String name, String city) {
        this(birthYear, name, city, null);
    }*/

    public Human(int birthYear, String name, String city, String jobTitle) {
        this.setBirthYear(birthYear);
        this.setName(name);
        this.setCity(city);
        this.setJobTitle(jobTitle);
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ", мне " + getBirthYear() +
                " лет. Работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}

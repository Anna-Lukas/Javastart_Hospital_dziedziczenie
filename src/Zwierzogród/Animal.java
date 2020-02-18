package Zwierzogród;

public class Animal {
    String name;
    String area;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, String area, int age) {
        this.name = name;
        this.area = area;
        this.age = age;
    }

    String getInfo() {
       return "Zwierz: " + name + ", występowanie: " + area + ", wiek: " + age;
    }
}

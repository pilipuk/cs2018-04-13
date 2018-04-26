package by.it.pilipuk.lesson06;

/**
 * Created by user on 26.04.2018.
 */
public class Dog {
    private String name;
    private int age;

    //вес собаки
    private int weight;

    //сила укуса собаки
    private double power;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    boolean win(Dog otherDog){
    double sh1=0.2*this.age+0.3*this.power+0.5*this.power;
        double sh2=0.2*otherDog.age+0.3*otherDog.power+0.5*otherDog.power;
        return sh1>sh2;
    }
  //  Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Кличка: "+name +". Возраст: "+ + age;}
}

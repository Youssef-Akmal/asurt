package javaapplication12;

class animal {

    private String name;
    private String sound;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setName(String y) {
        name = y;
    }

    public String getName() {
        return name;
    }

    public void play() {

    }

}

class Cat extends animal {

    private String gender;
    private boolean wildness;

    public Cat() {
    }

    public Cat(String name, int age, String gender, boolean wildness) {
        super.setName(name);
        super.setSound("meowing");
        super.setAge(age);
        this.gender = gender;
        this.wildness = wildness;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isWildness() {
        return wildness;
    }

    public void setWildness(boolean wildness) {
        this.wildness = wildness;
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " Is Playing Now .");
    }

    public void noise() {
        System.out.println("Cats are " + super.getSound());
    }

}

class Fish extends animal {

    private String color;
    private String category;

    public Fish() {
    }

    public Fish(String name, int age, String color, String category) {
        super.setName(name);
        super.setAge(age);
        super.setSound("drumming");
        this.color = color;
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " Is Playing Now .");
    }

    public void walk() {
        System.out.println(getCategory() + " Cannot Walk .");
    }
}

public class JavaApplication12 {

    public static void main(String[] args) {
        Fish f = new Fish();
        animal p = new Cat();
        Cat c = new Cat("jack", 12, "male", false);
        f.setName("nemo");
        p.setName("tom");
        f.play();
        p.play();
        c.noise();
        System.out.println(c.isWildness());

    }

}

public class Animal {
    String name;
    int runDistance;
    int swimDistance;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 10, 0);
        Cat cat2 = new Cat("Тайфун", 200, 0);
        Dog dog1 = new Dog("Тузик", 200, 5);
        Dog dog2 = new Dog("Бобик", 150, 10);

        cat1.run(cat1.name, cat1.runDistance);
        cat1.swim(cat1.name, cat1.swimDistance);
    }
    public void run(String name, int runDistance){
        System.out.printf("%s пробежал %d м\n", name, runDistance);
    }
    public void swim(String name, int swimDistance){
        System.out.printf("%s проплыл %d м\n", name, swimDistance);
    }
}

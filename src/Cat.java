public class Cat extends Animal {

    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    public void setRunDistance(int runDistance) {
        if (runDistance<=200){
            this.runDistance = runDistance;
        } else {
            System.out.println("Превышение лимита");
        }
    }
    @Override
    public void swim(String name, int swimDistance){
        System.out.println("Коты не умеют плавать!");
    }
}

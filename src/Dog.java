public class Dog extends Animal {

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    public void setRunDistance(int runDistance) {
        if (runDistance<=500) {
            this.runDistance = runDistance;
        } else System.out.println("Превышение лимита");
    }

    public void setSwimDistance(int swimDistance) {
        if (swimDistance<=10) {
            this.swimDistance = swimDistance;
        } else System.out.println("Превышение лимита");
    }
}


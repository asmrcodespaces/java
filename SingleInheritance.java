
class vehicel {
    void start() {
        System.out.println("Vehicel Starting.");
    }
}

class CAR extends vehicel {
    void drive() {
        System.out.println("Car is driving");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        CAR c = new CAR();
        c.start();// inherited supercalss method
        c.drive();// subclass method
    }

}
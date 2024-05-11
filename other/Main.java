package other;

class Vehicle {
    Vehicle getClone() {
        return new Vehicle();
    }
}

class Car extends Vehicle {
    @Override
    Car getClone() {
        return new Car(); // オーバーライドで戻り値の型を具体化（共変戻り値）
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        Vehicle clonedVehicle = myVehicle.getClone();
        Car clonedCar = myCar.getClone(); // Car型を返す

        System.out.println(clonedVehicle.getClass());
        System.out.println(clonedCar.getClass());
    }
}

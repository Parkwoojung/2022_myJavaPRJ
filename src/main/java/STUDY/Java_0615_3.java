package STUDY;

class Car {
    String color;
    int speed;

    void upSpeed(int value){
        System.out.println("속도를 올립니다.");
        speed = speed + value;
    }

    void downSpeed(int value){
        speed = speed - value;
    }
}

class Sedan extends Car { //부모의 car클래스를 상속받겠다. car클래스는 위에 있는 클래스
    int seatNum;

    int getSeatNum(){
        return seatNum;
    }
}

class Truck extends Car {
    int capacity;

    void upSpeed(String value){
        System.out.println("속도를 올립니다.");
        System.out.println(value);
    }

    int getCapacity(){
        return capacity;
    }
}

public class Java_0615_3{
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.seatNum = 5;
        truck1.capacity = 50;

        System.out.println("승용차 속도는" + sedan1.speed+ "km, 좌석수는 "+ sedan1.getSeatNum() +"개 입니다.");
        System.out.println("트럭 속도는" + truck1.speed+"km,적재량은"+ truck1.getCapacity()+"톤입니다.");
    }
}



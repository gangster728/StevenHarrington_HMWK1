public class ParkingTester {
    public static void main(String args[]){
        ParkingLot parkLot = new ParkingLot();
        System.out.println(parkLot);
        Car Infiniti = new Car("Infinit", "Blue", true);
        System.out.println(parkLot);
        Car Cadiliac = new Car("Cadiliac", "Black", false);
        System.out.println(parkLot);
        System.out.println(parkLot);
    }
}

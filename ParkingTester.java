public class ParkingTester {
    public static void main(String args[]){

        ParkingLot parkLot = new ParkingLot();

        System.out.println(parkLot);

        Car Infiniti = new Car("Infinit", "Blue", true);

        parkLot.park(Infiniti);

        System.out.println(parkLot);

        Car Cadiliac = new Car("Cadiliac", "Black", false);

        parkLot.park(Cadiliac);

        System.out.println(parkLot);

        parkLot.removeCar(0);
        
        System.out.println(parkLot);
    }
}

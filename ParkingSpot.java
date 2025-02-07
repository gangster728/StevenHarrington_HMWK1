public class ParkingSpot {

    Car occupiedcar = null;

    boolean handicap;

    public ParkingSpot(boolean handicap){

        this.handicap = handicap;

        this.occupiedcar = null;

    }

    public Car getCar(){

        return this.occupiedcar;
        
    }
}

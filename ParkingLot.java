public class ParkingLot {
    public ParkingSpot x[];
    public ParkingLot(){
        x = new ParkingSpot[8];
        for(int i = 0;i < 8;i++){
            if (i < 2){
                x[i] = new ParkingSpot(true);
                System.out.println(x[i].handicap);
            }
            x[i] = new ParkingSpot(false);
            System.out.println(x[i].handicap);
        }
    }
    public int park(Car car){
        for(int i = 0;i < 8;i++){
        if(car.handicap == x[i].handicap){
            x[i] = car;
            return i;
        }
        }
    }
    public String toString(){
        return "Handicap: " + "Standard: ";
    }
}

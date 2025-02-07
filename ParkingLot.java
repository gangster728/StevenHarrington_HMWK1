public class ParkingLot {
    
    public ParkingSpot x[];

    public ParkingLot(){

        x = new ParkingSpot[8];

        for(int i = 0;i < 8;i++){

            if (i < 2){

                x[i] = new ParkingSpot(true);
            }
            else{

                x[i] = new ParkingSpot(false);
            }
            
        }
    }

    public int park(Car car){

        for(int i = 0;i < 8;i++){

            if(car.handicap == x[i].handicap){

                x[i].occupiedcar = car;

                return i;
            }
        }
        return -1;
    }

    public Car removeCar(int i){

        Car y = x[i].occupiedcar;

        x[i].occupiedcar = null;

        return y;
    }

    public String toString(){

        int handicapCounter = 2;

        int standardCounter = 6;

        for(int i = 0;i < 8;i++){
            
            if(x[i].occupiedcar != null){

                if(x[i].handicap == true){

                    handicapCounter = handicapCounter - 1;
                }
                else if(x[i].handicap == false){

                    standardCounter = standardCounter -1;
                }
            }
            
        }
        return "Handicap: " + handicapCounter + " Standard: "+ standardCounter;
    }
}

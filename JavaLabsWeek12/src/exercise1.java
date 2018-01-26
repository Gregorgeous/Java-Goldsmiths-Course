public class exercise1 {
    abstract class vehicle {
        double AccelerationPerMinute;
        double currentSpeed;
        double weight;
        String brand;
        String typeOfVehicle;
        vehicle(String brand, String type, double weight, double AccelerationPerMinute){
            this.brand = brand;
            this.typeOfVehicle = type;
            this.weight = weight;
            this.AccelerationPerMinute= AccelerationPerMinute;
        }
    }

    interface drivesOnRoad{
        boolean hasWheels = true;
        double accelerate (int timeInMinutes);
    }

    interface floatsOnWater{
        boolean floatable = true;
    }

    public class car extends vehicle implements drivesOnRoad {
        int numOfWheels;
        car(String brand, String type, double weight, int numOfWheels, double AccelerationPerMinute){
            super(brand, type, weight, AccelerationPerMinute);
            this.numOfWheels = numOfWheels;
        }
        public double accelerate(int timeInMinutes) {
            return currentSpeed = AccelerationPerMinute*timeInMinutes;
        }
    }
}


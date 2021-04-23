package fiveKYU.designpaterns.builder.builders;

import fiveKYU.designpaterns.builder.cars.CarType;
import fiveKYU.designpaterns.builder.components.Engine;
import fiveKYU.designpaterns.builder.components.GPSNavigator;
import fiveKYU.designpaterns.builder.components.Transmission;
import fiveKYU.designpaterns.builder.components.TripComputer;

public interface Builder {
    void setCarType (CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}

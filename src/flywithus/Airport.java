package flywithus;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private final String name;
    private final CountryCode countryCode;
    private final String iataCode;
    private final List<String> connectedAirportIatas;

    public Airport(String name, CountryCode countryCode, String iataCode, List<String> connectedAirportIatas) {
        this.name = name;
        this.countryCode = countryCode;
        this.iataCode = iataCode;
        this.connectedAirportIatas = connectedAirportIatas;
    }

    public String getName() {
        return name;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public List<String> getConnectedAirportIatas() {
        return connectedAirportIatas;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", iataCode='" + iataCode + '\'' +
                ", connectedAirportIatas=" + connectedAirportIatas +
                '}';
    }
}

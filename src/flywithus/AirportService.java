package flywithus;

import java.util.*;

public class AirportService {
    // pole
    private final Map<String, Airport> map = new HashMap<>();


    public void addAirport(Airport airport) {
        String iata = airport.getIataCode();
        if (iata.length() != 3) {
            throw new RuntimeException("Incorrect Iata");
        }
        map.put(iata, airport);
        System.out.println("Adding new airport: " + airport);
    }

    public Airport getAirportByIata(String iata) {
        return map.get(iata);
    }

    public int airportsCount() {
        return map.size();
    }

    public List<Airport> getAllAirports() {
        Collection<Airport> values = map.values();
        System.out.println("Get all airports.");
        return new ArrayList<>(values);
    }

    public void deleteAirport(String iataCode) {
        map.remove(iataCode);
    }

}

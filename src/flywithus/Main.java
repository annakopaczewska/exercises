package flywithus;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Map<String, String> map = new HashMap<>();
        // klucz : wartosc
//       "kacper": "koza"
        // "anna": "kopaczewska"
//        map.put("kacper", "koza");
//        System.out.println(map.toString());
//        String value = map.get("kacper");
//        System.out.println(map.get("nie istnieje tkai klucz"));
// ----------------------------------------------------------------------------
        AirportService airportService = new AirportService();
        Airport poznan = new Airport("Poznan", CountryCode.PL, "POZ", Arrays.asList("WAW", "LTN"));
        Airport london = new Airport("London", CountryCode.GB, "STN", Arrays.asList("POZ", "WAW"));

        try {
            airportService.addAirport(london);
        } catch (RuntimeException ex) {

            System.out.println("Ojojoj error!");
        }

        airportService.addAirport(poznan);
        airportService.addAirport(london);

        Airport airport = airportService.getAirportByIata("POZ");
        System.out.println("Airport with iata = POZ : " + airport);

        List<Airport> allAirports = airportService.getAllAirports();
        System.out.println(allAirports);

        int count = airportService.airportsCount();
        System.out.println(count);


    }
}

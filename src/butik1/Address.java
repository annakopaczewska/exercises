package butik1;

public class Address {
    // pola klasy
    private final String name;
    private final String street;
    private final String city;
    private final String voivodeship;

    // konstruktor
    public Address(String name, String street, String city, String voivodeship) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.voivodeship = voivodeship;
    }

    public String getName(){
        return name;
    }

    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getVoivodeship(){
        return voivodeship;
    }

    @Override
    public String toString() {
      return name + ", "
              + street + ", "
              + city + ", "
              + voivodeship;
    }
}

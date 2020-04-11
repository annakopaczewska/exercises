package boutique;

public class Address {
    private final String street;
    private final int ZIPCode;
    private final String city;

    public Address( String street, int ZIPCode, String city) {
        this.street = street;
        this.ZIPCode = ZIPCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getZIPCode() {
        return ZIPCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "\n" + "street: " + street+
                "\n" + "ZIPCode: " + ZIPCode +
                "\n" + "city: " + city;
    }
}

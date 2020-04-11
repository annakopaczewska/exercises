package boutique;

public enum DeliveryType {
    COURIER(true), PARCEL_LOCKER(true);

    private final boolean coolDelivery;

    DeliveryType(boolean coolDelivery) {
        this.coolDelivery = coolDelivery;
    }

    public boolean isCoolDelivery() {
        return coolDelivery;
    }

}

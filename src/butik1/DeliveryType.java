package butik1;

public enum DeliveryType {
    COURIER(false), PARCEL_LOCKER(true);

    private final boolean coolDelivery;

    DeliveryType(boolean coolDelivery) {
        this.coolDelivery = coolDelivery;
    }

    public boolean isCoolDelivery(){
        return coolDelivery;
    }
}

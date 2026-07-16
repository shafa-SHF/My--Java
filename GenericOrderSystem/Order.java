package GenericOrderSystem;


class Order<ID, P extends Number> {
    private ID id;
    private String type;
    private P price;

    public Order(ID id, String type, P price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public P getPrice() {
        return price;
    }

    public String toString() {
        return id + " - " + type + " - " + price;
    }
}
    


package homeTask;


public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Device device = (Device) o;
//        return Float.compare(device.getPrice(), getPrice()) == 0 && Objects.equals(getManufacturer(), device.getManufacturer()) && Objects.equals(getSerialNumber(), device.getSerialNumber());
//    }

        @Override
    public boolean equals (Object obj){
        if(obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Device device = (Device) obj;
        boolean resmanufacturer = this.manufacturer.equals(device.manufacturer);
        boolean resprice = this.price == device.price;
        boolean resserialNumber = this.serialNumber.equals(device.serialNumber);
        return resprice && resmanufacturer && resserialNumber;
    }

    @Override
    public int hashCode(){
        int result = 37;
        result = result * 37 + Float.floatToIntBits(price);
        result = result * 37 + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = result * 37 + (serialNumber == null ? 0: serialNumber.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacturer=' " + manufacturer + ", price= " + price + ", serialNumber='" + serialNumber;
    }
}

package homeTask;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals (Object ob){
        if(ob == null || ob.getClass() != this.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) ob;
        boolean resmanufacturer = super.getManufacturer().equals(((Device) ob).getManufacturer());
        boolean resprice = super.getPrice() == ((Device) ob).getPrice();
        boolean resserialNumber = super.getSerialNumber().equals(((Device) ob).getSerialNumber());
        boolean resSpeed = this.speed == ethernetAdapter.speed;
        boolean resMac = this.mac.equals(ethernetAdapter.mac);
        return resmanufacturer && resSpeed && resMac && resprice && resserialNumber;
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result = result * 37 + speed;
        result = result * 37 + (mac == null ? 0 : mac.hashCode());
    return result;
    }

    @Override
    public String toString(){
        return super.toString() + ", 'speed:' " + speed + ", 'mac:' " + mac;
    }
}

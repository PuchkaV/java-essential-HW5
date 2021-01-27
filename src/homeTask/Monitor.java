package homeTask;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals (Object ob){
        if(ob == null || ob.getClass() != getClass()) return false;
        Monitor monitor = (Monitor)ob;
        boolean resmanufacturer = super.getManufacturer().equals(monitor.getManufacturer());
        boolean resprice = super.getPrice() == monitor.getPrice();
        boolean resserialNumber = super.getSerialNumber().equals(monitor.getSerialNumber());
        boolean resRsolutonx = this.resolutionX == monitor.resolutionX;
        boolean resRsolutony = this.resolutionY == monitor.resolutionY;

        return resRsolutonx && resRsolutony && resmanufacturer && resprice && resserialNumber;
    }

    @Override
    public int hashCode (){
        int result = super.hashCode();
        result = result * 37 + resolutionX;
        result = result * 37 + resolutionY;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", resolutionX=" + resolutionX + ", resolutionY=" + resolutionY;
    }
}

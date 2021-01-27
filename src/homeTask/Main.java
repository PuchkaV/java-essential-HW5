package homeTask;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("LG",300,"lg2858", 1920, 1080);
        Monitor monitor2 = new Monitor("LG",300,"lg2858", 1920, 1080);
        Monitor monitor3 = new Monitor("Benq",300.6f,"bq5971", 1920, 1080);
        EthernetAdapter ethernetadapter1 = new EthernetAdapter("Cisco",60,"ccs3954", 1000, "25:03:30:30");
        EthernetAdapter ethernetadapter2 = new EthernetAdapter("Tp-Link",40,"lds5817", 100, "23:05:31:32");

        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));
        System.out.println(ethernetadapter1.equals(ethernetadapter2));

        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());
        System.out.println(ethernetadapter1.hashCode());

    }
}

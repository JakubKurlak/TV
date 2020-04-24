package telewizory.Philips;

public class P43PU6523 extends TelewizorPhilips {

    private String hdmi;
    private String usb;

    public P43PU6523(String id) {
        super(id, 43);
    }

    public void setHdmi(String hdmi) {
        this.hdmi = hdmi;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }
}


public class App {

    final static DeviceFactory deviceFactory = new DeviceFactory();

    public static void main(String args[]){

        Device device = deviceFactory.getDevice(DeviceType.COMPUTER);
        device.sell();

        Device device2 = deviceFactory.getDevice(DeviceType.PHONE);
        device2.sell();

    }
}

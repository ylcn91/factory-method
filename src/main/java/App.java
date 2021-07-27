
public class App {

    final static DeviceFactory deviceFactory = new DeviceFactory();

    public static void main(String args[]){

        Device device = deviceFactory.getDevice(DeviceType.COMPUTER);
        device.sell();

        Device device2 = deviceFactory.getDevice(DeviceType.PHONE);
        device2.sell();

    }
}
        /*
        Let’s say that there is an store that sells different types of phones or pc’s.
        The job of the store is just to sell devices. The owners of the store will want to buy in stock, but when they open the store,
        they won't know which device they will want to buy in the future.It is not the job of the store to get involved with exactly how the devices is created.
        The solution to this problem is to use the factory method pattern. This involves adding an extra class between the electronic store and the electronic devices.
        This class has something called a factory method which handles deciding which class to return.
        This means that all the code that decides which device to make is moved out of the store and into the device factory. This makes the code much more maintainable.
        If the factory pattern was not used, the code would be much more difficult to maintain.
         */
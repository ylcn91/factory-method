
public class DeviceFactory {

    public Device getDevice(DeviceType deviceType){
        return deviceType.getType();
    }
}

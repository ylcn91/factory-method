public enum DeviceType {

    COMPUTER{
        public Device getType(){
            return new Computer();
        }
    },
    KEYBOARD{
        public Device getType(){
            return new Keyboard();
        }
    },
    PHONE{
        public Device getType(){
            return new Phone();
        }
    };

    abstract Device getType();
}

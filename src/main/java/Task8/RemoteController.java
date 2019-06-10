package Task8;


public class RemoteController {
    public static void main(String[] args) {
        Task8TV sony = new Task8TV("Sony");
        sony.powerOn();
        if (sony.isOn) {
            System.out.println("Now TV is On " );
        }

        sony.setChannel(3);
        sony.upVolume();
        sony.upVolume();
        sony.upVolume();
        sony.upVolume();
        System.out.println("Volume is "+sony.getVolume());
        sony.downVolume();
        System.out.println("Volume is "+sony.getVolume());
        System.out.println("Now TV is On channel - "+sony.currentChannel());

        System.out.println("Nou TV is Off " + sony.powerOff());
    }
}
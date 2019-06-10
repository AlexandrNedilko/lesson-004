package Task8;

public interface Device {
    boolean powerOn();
    boolean powerOff();
    void setChannel(int channel);
    int currentChannel();
}
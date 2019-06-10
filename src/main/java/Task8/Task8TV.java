package Task8;

public class Task8TV extends TVDevice {
    private int channel;
    private int volume = 0;


    public Task8TV(String modelName) {
        isOn = false;
        channel=1;
        this.modelName = modelName;
    }

    @Override
    public boolean powerOn() {
        isOn = true;
        return isOn;
    }

    @Override
    public boolean powerOff() {
        isOn = false;
        return !isOn; // при запросе выключен ли отвечаем да, так как вызвав этот метод отключили телевизор
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public int currentChannel() {
        return channel;
    }

    @Override
    public void upVolume( ) {
        volume +=1;
    }

    @Override
    public void downVolume( ) {
        volume -= 1;
    }

    @Override
    public void mute() {
        volume=0;
    }
    public int getVolume() {
        return volume;
    }
}

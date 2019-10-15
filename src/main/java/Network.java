import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxNumberOfDevices;

    public Network(String name){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.maxNumberOfDevices = 3;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void disconnectAll() { devices.clear(); }

    public int freeSlotsCount() {
        return maxNumberOfDevices - deviceCount();
    }

    public void connect(IConnect device){
        if ( freeSlotsCount() > 0) {
            devices.add(device);}
    }


}
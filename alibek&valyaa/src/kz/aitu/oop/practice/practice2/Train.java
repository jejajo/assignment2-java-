package kz.aitu.oop.practice.practice2;
import java.util.ArrayList;
import java.util.List;

public class Train {
    private int id;
    private String name;
    private String time;
    private double speed;
    private List<Wagon> wagons = new ArrayList<Wagon>();

    public Train(String name, String time, double speed, int id){
        this.id = id;
        this.name = name;
        this.time = time;
        this.speed = speed;
    }

    public String Display(){
        return this.id + ". " + this.name + ", Time interval: " + this.time + ", Speed: " + this.speed;
    }

    public void DisplayWagons(){
        for (int i = 0; wagons.size() > i; i++){
            wagons.get(i).getInfo();
        }
    }

    public void AddWagon(Wagon wagon){
        this.wagons.add(wagon);
    }

    public void RemoveWagon(int id){
        this.wagons.remove(id);
    }

}

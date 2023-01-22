package kz.aitu.oop.practice.practice2;

public class Plackart extends Wagon{
    public Plackart(String name, Boolean invalid){
        super(name, invalid);
        super.capacity = 50;
        super.freeSeats = 50;
    }

    @Override
    public void getInfo(){
        System.out.println("Plackart");
    }
}

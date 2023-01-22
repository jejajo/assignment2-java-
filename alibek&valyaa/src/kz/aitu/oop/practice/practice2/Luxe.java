package kz.aitu.oop.practice.practice2;

public class Luxe extends Wagon{
    public Luxe(String name, Boolean invalid){
        super(name, invalid);
        super.capacity = 10;
        super.freeSeats = 10;
    }

    @Override
    public void getInfo(){
        System.out.println("Luxe");
    }
}

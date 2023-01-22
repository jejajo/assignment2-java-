package kz.aitu.oop.practice.practice2;

public class Caffe extends Wagon{
    public Caffe(String name, Boolean invalid){
        super(name, invalid);
        super.capacity = 25;
        super.freeSeats = 25;
    }

    @Override
    public void getInfo(){
        System.out.println("Caffe");
    }
}

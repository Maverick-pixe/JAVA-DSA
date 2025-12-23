abstract class Animal {

    private String Breed;
    private int Size;
    private double Weight;

    public Animal(String breed, int size, double weight) {
        Breed = breed;
        Size = size;
        Weight = weight;
    }

}

class Dog extends Animal{

    public Dog(String breed, int size, double weight) {
        super(breed, size, weight);
    }

    void  sound(){
        System.out.println(" Bark ");
        System.out.println();
    }

}
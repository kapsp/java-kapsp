public class Zoo {
    static String species;
    String animalName;
    int Population;
    public static void main(String[] args) {
        Zoo.species="mammals";

        Zoo animal=new Zoo();
        Zoo animal2=new Zoo();

        animal.animalName="Lions";
        animal.Population=200;

        animal2.animalName="tigers";
        animal2.Population=100;


        System.out.println(" Animal Name "+animal.animalName);
        System.out.println(" Animal2 Name "+animal2.animalName);
        System.out.println(" Animal Population "+animal.Population);
        System.out.println(" Animal2 Population "+animal2.Population);

    }
}

public class Zoo {
    static String species;
    String animalName;
    int Population;

    static void changeSpecies(String s){
        species=s;
    }
    public static void main(String[] args) {
        Zoo.species="mammals";
        System.out.println("Species name "+Zoo.species);

        Zoo animal=new Zoo();
        Zoo animal2=new Zoo();


        animal.animalName="Blue Whale";
        animal.changeSpecies("Fish");
        animal.Population=20;





        System.out.println(" Animal spcies "+animal.species);
        System.out.println(" Animal2 species "+animal2.species);

        System.out.println(" Animal2 population "+animal.Population);


    }
}

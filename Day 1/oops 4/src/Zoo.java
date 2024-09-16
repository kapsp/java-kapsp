public class Zoo {
    static String species;
    String animalName;
    int Population;

    static void changeSpecies(String s){
        species=s;
    }

    void otherChange(String an,int p){
        animalName=an;
        Population=p;
    }

    void displayresult(){
        System.out.println(" animal Species "+species);
        System.out.println("animal details = Animal Name "+animalName+" and animal Population "+Population );
    }

    public static void main(String[] args) {
        Zoo.species="mammals";
        System.out.println("Species name "+Zoo.species);

        Zoo animal=new Zoo();
        animal.otherChange("Lion",200);
        Zoo animal2=new Zoo();
        animal2.otherChange("Tiger",100);

        System.out.println(" Animal Name "+animal.animalName);
        System.out.println("  Animal population "+animal.Population);
        System.out.println(" Animal2 Name "+animal2.animalName);

        System.out.println(" Animal2 population "+animal2.Population);

        System.out.println();
        System.out.println();

        animal.displayresult();
        animal2.displayresult();









    }
}

public class immut2 {
    public static void main(String[] args) {
        nationalPark q=new nationalPark();
        q.setCountry("india");
        q.setName("tadoba");
        park w=new park(q,"chandrapur",5);
        System.out.println(w.getnationalPark().getCountry());
        System.out.println("modifying");
        w.getnationalPark().setName("yellowstone");
        w.getnationalPark().setCountry("usa");
        System.out.println(w.getnationalPark().getName()+" "+w.getnationalPark().getCountry());


    }
}

class nationalPark{
 String name;
 String country;



 public String getName(){
     return name;
 }
    public String getCountry(){
        return country;
    }

    public  void setName(String name){
        this.name=name;
    }

    public  void setCountry(String country ){
        this.country=country;
    }


}

final class park{
    nationalPark a;
     private final String district;
     private final int totalGates;

     park(nationalPark a,String district,int totalGates){
         this.a=a;
         this.district=district;
         this.totalGates=totalGates;
     }

     public nationalPark getnationalPark(){
         return a;
     }

     public String getDistrict(){
         return district;
     }

     public int getTotalGates(){
         return totalGates;
     }


}
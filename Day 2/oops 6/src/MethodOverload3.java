public class MethodOverload3 {
    public void HorsePower(byte num){
        System.out.println(" the byte type and number is "+num);
    }

    public void HorsePower(int num){
        System.out.println(" the int type and number is "+num);
    }
    public void HorsePower(float num){
        System.out.println(" the float type and number is "+num);
    }
    public void HorsePower(double num){
        System.out.println(" the double type and number is "+num);
    }


    public static void main(String[] args) {
  MethodOverload3 number=new MethodOverload3();
  number.HorsePower(10);
  number.HorsePower(34.7f);
    }
}

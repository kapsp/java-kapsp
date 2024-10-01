//Define a class Message with a final method sendMessage().
//Implement a subclass EmailMessage that attempts to override sendMessage().
//check the impact of the final keyword on method overriding.
//and similarly make class final and try to inherit that and also check
//the impact of final keyword on making class as final.
//
public class Task2 {
    public static void main(String[] args) {
//        EmailMessage a= new EmailMessage();
//        a.sendMessage();
        //wiil give error


    }
}

class Message{

    final void sendMessage(){
        System.out.println("yo in Message class ");
    }
}

//class EmailMessage extends Message{
//    void sendMessage(){
//        System.out.println("yo in email");
//    }
//}
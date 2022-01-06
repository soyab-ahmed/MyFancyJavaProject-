import java.sql.SQLOutput;

public class Main {
    public  int id ;
    public  String name ;

    public Main(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Main x = new Main(182033,"Soyab Ahmed");
        System.out.println("Id of x is " + x.id );
        System.out.println("My name is " + x.name);
        System.out.println("For 6 january commit.");
    }
}

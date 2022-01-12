import java.sql.SQLOutput;

public class Main {
    private  int id ;
    private   String name ;

    private Main(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        System.out.println("No conflict");
    }
}
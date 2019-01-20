import java.sql.SQLOutput;

public class Warriors extends Human {
//    String defaultBlade = "Slash";
    public final static int FIRE_BLADE = 1 ;
    public final static int ICE_BLADE = 2 ;

    public void attack () {
        System. out .println( "Slash!!" ) ;
    }
    public void attack (int x) {

        if (x == FIRE_BLADE){
        System. out .println( "Fire Slash!!" ) ;
    }else{
        if(x == ICE_BLADE){
            System. out .println( "Ice Slash!!" ) ;
        }
        else{
            throw new IllegalArgumentException( "Please enter 1 or 2." ) ;
        }
        }
    }

    public Warriors() {
        System.out.println(" slash!!");
    }
    public Warriors(int x){
        System.out.println("Fire slash");
    }
    public Warriors(String x){
        System.out.println("Ice slash!!");
    }
}

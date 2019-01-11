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
    }
}

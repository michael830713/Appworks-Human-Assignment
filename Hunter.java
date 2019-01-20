public class Hunter extends Human {

    public final static int FIRE_BOW = 1 ;
    public final static int ICE_BOW = 2 ;
    public void attack () {
        System. out .println( "Arrow!" ) ;
    }
    public void attack (int x) {

        if (x == FIRE_BOW){
            System. out .println( "Fire Arrow!!" ) ;
        }else{
            if(x == ICE_BOW){
                System. out .println( "Ice Arrow!!" ) ;
            }
            else{
                throw new IllegalArgumentException( "Please enter 1 or 2." ) ;
            }
        }
    }
    public Hunter() {
        System.out.println("Arrow!!");
    }
    public Hunter(int x){
        System.out.println("Fire Arrow!!");
    }
    public Hunter(String x){
        System.out.println("Ice Arrow!!");
    }
}

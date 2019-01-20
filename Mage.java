public class Mage extends Human{
//    String defaultStaff = "Arcane Missiles";
    public final static int FIRE_BALL = 1 ;
    public final static int FROST_BALL = 2 ;
    public void attack () {
        System. out .println( "Arcane Missiles!" ) ;
    }
    public void attack (int x) {

        if (x == FIRE_BALL){
            System. out .println( "FireBall!!" ) ;
        }else{
            if(x == FROST_BALL){
                System. out .println( "FrostBall!!" ) ;
            }
            else{
                throw new IllegalArgumentException( "Please enter 1 or 2." ) ;
            }
        }
    }
    public Mage() {
        System.out.println("Arcane Missiles!!");
    }
    public Mage(int x){
        System.out.println("FireBall!!");
    }
    public Mage(String x){
        System.out.println("FrostBall!!");
    }
}

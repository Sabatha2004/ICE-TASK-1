package icetask1;


public class IceTask1 {

    
    public static void main(String[] args) {
        
        Bird brd = new Bird(1,"Parrot","Red");
        Reptile rept = new Reptile(2,"Anaconda",2);
        
        System.out.println("Bird IDtag: "+brd.getIDtag());
        System.out.println("Bird Species: "+ brd.getSpecies());
        System.out.println("Bird Colour: "+brd.getColour()+"\n");
        
        System.out.println("Reptile IDtag: "+rept.getIDtag());
        System.out.println("Reptile Species: "+rept.getSpecies());
        System.out.println("Reptile Blood Temperature: "+rept.getBloodTemp());
    }
    
}

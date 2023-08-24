package icetask1;


public class Bird extends Animal {
    
    private String colour;
    
      public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    
    Bird(int IDtag, String species, String colour){
        
        this.IDtag = IDtag;
        this.species = species;
        this.colour = colour;
    }
    
}

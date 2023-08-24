package icetask1;

public class Reptile extends Animal {
    
    private double bloodTemp;
    
     
      public double getBloodTemp() {
        return bloodTemp;
    }

    public void setColour(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
    
    
    Reptile(int IDtag, String species, double bloodTemp){
        
        this.IDtag = IDtag;
        this.species = species;
        this.bloodTemp = bloodTemp;
    }
    
    
}

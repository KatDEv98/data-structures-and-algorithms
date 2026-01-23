/*
 * K.Q Tawana 29290473
 */
public class ColdBeverage extends Drink {
    
    
    private Boolean isCarbonated;
    
    //default constructor
    public ColdBeverage(){}
    
    //constructor with parameters
    public ColdBeverage(String name, String temperature, String type, Boolean isCarbonated){
    super(name,temperature, type);
    
    this.isCarbonated = isCarbonated;
    
   }

   
    

    public Boolean getIsCarbonated() {
        return isCarbonated;
    }

    

    public void setIsCarbonated(Boolean isCarbonated) {
        this.isCarbonated = isCarbonated;
    }
    
    
    
    @Override
    public void serve(){

        System.out.println("Serve chilled(Ice:optional),in a glass or platic cup" );

}
 @Override 
    public String toString(){
        return "Drink info:" + "\n" 
        + "Name: " + getName() + "\n"
        + "Type: " + getType() + "\n"
        + "Hot/Cold: " + getTemperature() + "\n"
        + "Carbonated: " + isCarbonated; 
    

        
        
        
    }





    


    
}
    
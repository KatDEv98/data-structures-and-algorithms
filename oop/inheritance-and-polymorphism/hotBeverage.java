
/*
 * K.Q Tawana 29290473
 */
public class hotBeverage extends Drink {
    
    
    private String caffeineContent;
    
    //default constructor
    public hotBeverage(){}
    
    
    //constructor with paramenters
    public hotBeverage(String name, String temperature, String type,String caffeineContent){
    super(name,temperature, type);
    this.caffeineContent = caffeineContent;
    
    
    }

    public String getcaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(String caffeineContent) {
        this.caffeineContent = caffeineContent;
    }
    @Override
    public void serve(){
        System.out.println("Serve hot(milk:optional)in a mug or paper cup.");}

    @Override 
    public String toString() {
        return "Drink info:" + "\n" 
        + "Name: " + getName() + "\n"
        + "Type: " + getType() + "\n"
        + "Hot/Cold: " + getTemperature() + "\n"
        + "Caffeine Content: " + caffeineContent;
    
    
    
    
}}

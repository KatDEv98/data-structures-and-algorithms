/*
 * K.Q Tawana 29290473
 */
public abstract class Drink {
    
    private String name;
    private String temperature;
    private String type;
    
    //default constrcutor
    public Drink(){
    this("0000"," ", "000000");}
    
    //constructor with parameters
    public Drink(String name, String temperature, String type){
    this.name = name;
    this.temperature = temperature;
    this.type = type;}
 
    
    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //Abstract method
    public abstract void serve();
 
    //To String method
    @Override
    public String toString(){
        return "Drink info:" + "\n" 
        + "Name: " + getName() + "\n"
        + "Type: " + getType() + "\n"
        + "Hot/Cold: " + getTemperature();

    




}}

/*
 * K.Q Tawana 29290473
 */
public class testDrink {
    
    public static void main( String[] args){
        
        
        
        //objects of types of drinks
        Drink drink1 = new ColdBeverage("Pina-Cooler","Cold", "Juice", false);
        Drink drink2 = new ColdBeverage("lemon-Aid","Cold", "Fizzy-Drink", true);
        Drink drink3 = new hotBeverage("Shado-shot","Hot","Coffee","10 %");
        Drink drink4 = new hotBeverage("Nature-sip","Hot","Coffee","3 %");
        
        
        System.out.println(drink1); //implict call 
        System.out.println("-------------"); 
        System.out.println(drink1.toString()); //Explicit call
        drink1.serve();
        System.out.println("---------------------------\n"); //divider
        
        
        System.out.println(drink2);
        System.out.println("-------------");
        System.out.println(drink2.toString());
        drink2.serve();
        System.out.println("---------------------------\n");
        
        
        
        
        
        
        System.out.println(drink3);
        System.out.println("-------------");
        System.out.println(drink3.toString());
        drink3.serve();
        System.out.println("---------------------------\n");
        
    
        System.out.println(drink4);
        System.out.println("-------------");
        System.out.println(drink4.toString());
        drink4.serve();
        System.out.println("---------------------------\n");
        
        
    }





}

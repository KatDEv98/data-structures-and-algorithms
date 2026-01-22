
/**
 * 29290473
 *
 * K.Q Tawana
 */
public class Patient {
      
    private String name;
    private boolean emergency;

    public Patient(String name, boolean emergency) {
        this.name = name;
        this.emergency = emergency;
    }

    public String getName() {
        return name;
    }

    public boolean isEmergency() {
        return emergency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }

    @Override
    public String toString() {
        if (emergency){
           return "Patient= " + name + " (EMERGENCY ADMISSION)";}
        
        else{
            
            return "Patient= " + name + " (NORMAL ADMISSION)";}
    }
    }


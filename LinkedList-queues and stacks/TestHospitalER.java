/* 
 * 29290473
 * K.Q Tawana
 */public class TestHospitalER {
    public static void main(String[] args) {
        HospitalERSystem CurrentER = new HospitalERSystem();

        // Admit patients
        CurrentER.patientAdmission("Mpho", true);
        CurrentER.patientAdmission("Dimkatso", false);
        CurrentER.patientAdmission("Thabo", false);
        CurrentER.patientAdmission("Charlie", true);
        CurrentER.displayStatus();

        // Treat patients
        CurrentER.patientTreatment();
        CurrentER.patientTreatment();
        CurrentER.displayStatus();

        // Undo treatment
        CurrentER.undoTreatment();
        CurrentER.displayStatus();

        // Treatment until queue is empty
        CurrentER.patientTreatment();
        CurrentER.patientTreatment();
        CurrentER.patientTreatment(); 
        CurrentER.displayStatus();
    }
}


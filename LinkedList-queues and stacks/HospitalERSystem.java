/*
 * 29290474
 * K.Q Tawana
 */
public class HospitalERSystem {
    private QueueAsMyLinkedList<Patient> patientQueue;
    private StackAsMyLinkedList<Patient> treatmentHistory;

    public HospitalERSystem() {
        patientQueue = new QueueAsMyLinkedList<>();
        treatmentHistory = new StackAsMyLinkedList<>();
    }

    // Patient Admission
    public void patientAdmission(String name, boolean emergency) {
        Patient newPatient = new Patient(name, emergency);
        if (emergency) {
            MyLinkedList<Patient> currentList = new MyLinkedList<>();
            currentList.prepend(newPatient);

            while (!patientQueue.isEmpty()) {
                currentList.append(patientQueue.dequeue());
            }

            patientQueue = new QueueAsMyLinkedList<>();
            while (!currentList.isEmpty()) {
                patientQueue.enqueue(currentList.removeFirst());
            }
        } else {
            patientQueue.enqueue(newPatient);
        }
    }

    // Patient Treatment
    public Patient patientTreatment() {
        if (patientQueue.isEmpty()) {
            System.out.println("NO PATIENT FOR TREATMENT");
            return null;
        }
        Patient treated = patientQueue.dequeue();
        treatmentHistory.push(treated);
        System.out.println("Treating: " + treated);
        return treated;
    }

    // Undo last treatment
    public void undoTreatment() {
        Patient last = treatmentHistory.pop();
        if (last == null) {
            System.out.println("NO UNDOING OF TREATMENT");
        } else {
            System.out.println("UNDO TREATMENT : " + last);
            patientQueue.enqueue(last); // Or enqueueFront(last) if required
        }
    }

    // System status
    public void displayStatus() {
        System.out.println("Current Queue: " + patientQueue);
        System.out.println("Treatment History: " + treatmentHistory);
    }
}


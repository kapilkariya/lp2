import java.util.*;

public class ass6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Hospital Expert System: Patient Triage Assistant ===");

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("\nSelect Symptoms (Y/N):");

        System.out.print("Chest Pain? ");
        boolean chestPain =
            sc.next().equalsIgnoreCase("y");

        System.out.print("Shortness of Breath? ");
        boolean shortBreath =
            sc.next().equalsIgnoreCase("y");

        System.out.print("Heavy Bleeding? ");
        boolean bleeding =
            sc.next().equalsIgnoreCase("y");

        System.out.print("High Fever? ");
        boolean highFever =
            sc.next().equalsIgnoreCase("y");

        System.out.print("Recent Injury? ");
        boolean injury =
            sc.next().equalsIgnoreCase("y");

        System.out.print("Dizziness or Fainting? ");
        boolean dizziness =
            sc.next().equalsIgnoreCase("y");

        System.out.print("Severe Stomach Pain? ");
        boolean stomachPain =
            sc.next().equalsIgnoreCase("y");

        String department;
        String advice;

        System.out.println("\nAnalyzing symptoms...");

        if (bleeding || injury) {

            department = "Emergency Room (ER)";
            advice = "Immediate attention required. Proceed to the ER.";

        } else if (chestPain || shortBreath) {

            department = "Cardiology";
            advice = "Cardiac symptoms detected. Visit Cardiology immediately.";

        } else if (highFever && age < 12) {

            department = "Pediatrics";
            advice = "High fever in child. Visit Pediatrics urgently.";

        } else if (highFever) {

            department = "General Medicine";
            advice = "Consult a general physician for evaluation.";

        } else if (dizziness) {

            department = "Neurology";
            advice = "Neurological symptoms present. Visit Neurology.";

        } else if (stomachPain) {

            department = "Gastroenterology";
            advice = "Visit a gastroenterologist for further diagnosis.";

        } else {

            department = "Outpatient (OPD)";
            advice = "No critical symptoms. You may proceed to OPD.";
        }

        System.out.println("\n=== Patient Report ===");

        System.out.println("Name: " + name);

        System.out.println(
            "Recommended Department: " + department);

        System.out.println("Advice: " + advice);
    }
}
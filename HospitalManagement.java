package javaProject;
import java.util.Scanner;

class Patient {
    int patientId;
    String patientName;
    int patientAge;
    String patientGender;
    String patientAddress;
    String patientDisease;
    long patientMobile;
    long patientAddhar;
    double admissionCharge;
    double medicineCost;
    double doctorFee;
    double totalBill;
    double GST;
    static Scanner sc = new Scanner(System.in);

    void setPatientDetails() {
        System.out.println("\n******Insert Patient Details******");
        System.out.print("Enter Patient Id            : ");
        patientId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Name          : ");
        patientName = sc.nextLine();
        System.out.print("Enter Patient Age           : ");
        patientAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Gender        : ");
        patientGender = sc.nextLine();
        System.out.print("Enter Patient Address       : ");
        patientAddress = sc.nextLine();
        System.out.print("Enter Patient Disease       : ");
        patientDisease = sc.nextLine();
        System.out.print("Enter Patient Mobile Number : ");
        patientMobile = sc.nextLong();
        System.out.print("Enter Patient Addhar Number : ");
        patientAddhar = sc.nextLong();
        sc.nextLine();
    }

    void getPatientDetails() {
        System.out.println("******Patient Details******");
        System.out.println("Patient ID            : " + patientId);
        System.out.println("Patient Name          : " + patientName);
        System.out.println("Patient Age           : " + patientAge);
        System.out.println("Patient Gender        : " + patientGender);
        System.out.println("Patient Address       : " + patientAddress);
        System.out.println("Patient Disease       : " + patientDisease);
        System.out.println("Patient Mobile Number : " + patientMobile);
        System.out.println("Patient Addhar Number : " + patientAddhar);
    }
    void generateBill(){
        System.out.print("Enter amount of Admission Charge : ");
        admissionCharge = sc.nextDouble();
        System.out.print("Enter amount of Medicine Cost    : ");
        medicineCost = sc.nextDouble();
        System.out.print("Enter amount of Doctor Fee       : ");
        doctorFee = sc.nextDouble();
        totalBill = admissionCharge+medicineCost+doctorFee;
        GST = totalBill/10;
        System.out.println("------------------------------------------------");
        System.out.println("Total Amount                       :"+totalBill);
        System.out.println("10% GST                            :"+GST);
        System.out.println("Grand Total                        :"+(totalBill+GST));
        System.out.println("------------------------------------------------");
    }
}

class Doctor {
    int doctorID;
    String doctorName;
    long doctorMobile;
    String doctorAddress;
    String doctorSpecialization;
    static Scanner sc = new Scanner(System.in);

    void setDoctorDetails() {
        System.out.println("\n******Insert Doctor Details******");
        System.out.print("Enter Doctor Id             : ");
        doctorID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Doctor Name           : ");
        doctorName = sc.nextLine();
        System.out.print("Enter Doctor Mobile Number  : ");
        doctorMobile = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Doctor Address        : ");
        doctorAddress = sc.nextLine();
        System.out.print("Enter Doctor Specialization : ");
        doctorSpecialization = sc.nextLine();
    }

    void getDoctorDetails() {
        System.out.println("\n******Doctor Details******");
        System.out.println("Doctor ID             : " + doctorID);
        System.out.println("Doctor Name           : Dr." + doctorName);
        System.out.println("Doctor Mobile Number  : " + doctorMobile);
        System.out.println("Doctor Address        : " + doctorAddress);
        System.out.println("Doctor Specialization : " + doctorSpecialization+"Speacialist");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        System.out.print("Select User Admin Panel (Patient or Doctor ) : ");
        String Admin = Patient.sc.nextLine();
        switch (Admin) {
            case "Patient":
                String PatientId = "patientadmin";
                String PatientPassword = "admin123";
                System.out.println("Enter User Id : ");
                String pid = Patient.sc.nextLine();
                System.out.println("Enter User Password : ");
                String pw = Patient.sc.nextLine();

                if (PatientId.equals(pid) && PatientPassword.equals(pw)) {
                    System.out.print("Enter number of Patient : ");
                    int n = Patient.sc.nextInt();
                    Patient.sc.nextLine();
                    Patient[] patientDetails = new Patient[n];

                    for (int i = 0; i < n; i++) {
                        patientDetails[i] = new Patient();
                    }
                    int choice;
                    do {
                        System.out.println("1. Add Patient Details");
                        System.out.println("2. Show Patient Details");
                        System.out.println("3. Search Patient");
                        System.out.println("4. Generate Bill");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        choice = Patient.sc.nextInt();
                        Patient.sc.nextLine();

                        switch (choice) {
                            case 1:
                                for (int i = 0; i < patientDetails.length; i++) {
                                    System.out.println("Patient : " + (i + 1));
                                    patientDetails[i].setPatientDetails();
                                }
                                break;

                            case 2:
                                for (Patient p : patientDetails) {
                                    p.getPatientDetails();
                                }
                                break;

                            case 3:
                                System.out.print("Enter Patient ID to search: ");
                                int id = Patient.sc.nextInt();
                                for (Patient p : patientDetails) {
                                    if (p.patientId == id) {
                                        p.getPatientDetails();
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.print("Enter Patient ID to Generate Bill : ");
                                int BllId = Patient.sc.nextInt();
                                for (Patient bill : patientDetails) {
                                    if(bill.patientId==BllId){
                                        bill.generateBill();
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Exiting");
                                break;

                            default:
                                System.out.println("Invalid choice! Try again.");
                        }
                    } while (choice != 5);
                } else {
                    System.out.println("Invalid details !");
                }
                break;
            case "Doctor":
                String DoctorId = "doctoradmin";
                String DoctorPassword = "admin123";
                System.out.println("Enter User Id : ");
                String dId = Doctor.sc.nextLine();
                System.out.println("Enter User Password : ");
                String dpw = Doctor.sc.nextLine();
                if (DoctorId.equals(dId) && DoctorPassword.equals(dpw)) {
                    System.out.print("Enter number of Doctor : ");
                    int dn = Doctor.sc.nextInt();
                    Doctor.sc.nextLine();
                    Doctor[] doctorDetails = new Doctor[dn];
                    for (int i = 0; i < doctorDetails.length; i++) {
                        doctorDetails[i] = new Doctor();
                    }
                    
                    int dchoice;
                    do {
                        System.out.println("1.Add Doctor Deatails");
                        System.out.println("2.Show Doctor Deatails");
                        System.out.print("Enter your choice: ");
                        dchoice = Doctor.sc.nextInt();
                        Doctor.sc.nextLine();
                        switch (dchoice) {
                            case 1:
                                for (int i = 0; i < doctorDetails.length; i++) {
                                    System.out.print("Doctor : " + (i + 1));
                                    doctorDetails[i].setDoctorDetails();
                                }
                                break;
                            case 2:
                                for (int i = 0; i < doctorDetails.length; i++) {
                                    doctorDetails[i].getDoctorDetails();
                                }
                                break;
                            case 3:
                                System.out.println("Exiting");
                                break;
                            default:
                                System.out.println("Invalid choice! Try again.");
                                break;
                        }
                    } while (dchoice!=3);
                } else {
                    System.out.println("Invalid details !");
                }

            default:
                break;
        }
    }
}

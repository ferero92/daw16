package test;

import objects.HospitalEmergency;
import objects.Patient;

public class TestEmergency {

  public static void main(String[] args) {

    HospitalEmergency hospital = new HospitalEmergency();

    Patient p1 = new Patient();
    Patient p3 = new Patient("Rose", "stomach ache", 3);
    Patient p2 = new Patient("Sally", "sick", 2);
    
    hospital.push(p2);
    hospital.push(p3);
    hospital.push(p1);
    
    System.out.println(hospital.toString());
  }

}

package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;  //each lab already has a name and status that came from the Lab class
    LabStatus labStatus;
    //Make sure in constructor the ArrayList is instantiated so there are no null pointer exceptions;
    Student student;

    public Student() {
        this(new ArrayList<>());
    }  //no labs were given as a parameter so we just instantiate a new blank arrayList

    public Student(List<Lab> labs) {
        this.labs =labs;
    } //given the labs in parameter needs to set this equal to that.

    public Lab getLab(String labName) {
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getName().equals(labName)) {
                return labs.get(i);
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
       try {
           Lab foundLab = getLab(labName);
           foundLab.setStatus(labStatus);}
       catch (Exception e){
           throw new UnsupportedOperationException(e);
       }

        // Lab myLab = getLab(labName);
       //myLab.setStatus(labStatus) = LabStatus.COMPLETED;
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override       // you can print the lab name and status via labs.get(i).getName() or .getStatus() in a loop.  Since we defined
    // the toString in the lab status we can also just do a print out of the lab object itself.
    public String toString() {
        String result = "";
        StringBuilder sb = new StringBuilder();
        for(int i = labs.size() -1; i >= 0; i--) {
            if (i == 0) {
                result += labs.get(i).toString();
            }
            else { result += labs.get(i).toString() + '\n';
            }
        }
        return result;
    }
}

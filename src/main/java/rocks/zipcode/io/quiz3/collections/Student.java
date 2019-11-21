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
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();
    }

    public Lab getLab(String labName) {
        for (int i = 0; i < labs.size(); i++) {
             if( labs.get(i).getName().equals(labName));
             return labs.get(i);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = labs.size() -1; i >= 0; i--) {
            sb.append(String.format("%s > ", labs.get(i).getName()));
            for(int j = 0; j < labs.size() ; j++) {
                sb.append(String.format("%s\n", labs.get(j).getStatus()));
            }
        }
         return sb.toString();
    }
}

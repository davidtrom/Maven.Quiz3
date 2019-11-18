package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;
    private Lab labName;


    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        return this.labName;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName.setStatus(labStatus);

    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return this.getLabStatus(labName);
    }
}

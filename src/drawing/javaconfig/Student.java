package drawing.javaconfig;

public class Student {

    private Branch branch;

    public Student(Branch branch) {
        this.branch = branch;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void study() {
        this.branch.showBranch();
        System.out.println("Student is Studying");
    }
}

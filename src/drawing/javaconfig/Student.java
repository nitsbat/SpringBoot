package drawing.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    @Autowired
    private Branch branch;

    @Autowired
    private String name;

    public Student() {
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void study() {
        this.branch.showBranch();
        System.out.println(name + " is Studying");
    }
}

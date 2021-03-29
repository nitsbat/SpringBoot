package drawing.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private Branch branch;

    private String name;

    public Student(Branch branch, String name) {
        this.branch = branch;
        this.name = name;
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

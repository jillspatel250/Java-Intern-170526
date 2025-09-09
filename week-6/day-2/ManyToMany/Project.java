package ManyToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {

    @Id
    @Column(name = "project_id")
    private int pid;
    private String projectName;
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public Project(){
        super();
    }

    public Project(int pid, String projectName, List<Employee> employees) {
        this.pid = pid;
        this.projectName = projectName;
        this.employees = employees;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

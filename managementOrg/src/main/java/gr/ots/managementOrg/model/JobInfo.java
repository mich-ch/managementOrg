package gr.ots.managementOrg.model;

public class JobInfo {
    private long id;
    private String name;
    private String roleDescription;
    private int numberEmpl;

    public JobInfo(long id, String name, String roleDescription, int numberEmpl) {
        this.id = id;
        this.name = name;
        this.roleDescription = roleDescription;
        this.numberEmpl = numberEmpl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public int getNum() {
        return numberEmpl;
    }

    public void setNum(int num) {
        this.numberEmpl = numberEmpl;
    }
}

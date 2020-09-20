package gr.ots.managementOrg.model;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Department {
    private long id;
    private String name;
    private List<SubDepartment> subDepartments;
    private List<JobInfo> jobsInfo;
    private int management_id;

    public Department(long id, String name, List<SubDepartment> subDepartments, List<JobInfo> jobsInfo, int management_id) {
        this.id = id;
        this.name = name;
        this.subDepartments = subDepartments;
        this.jobsInfo = jobsInfo;
        this.management_id = management_id;
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

    public List<SubDepartment> getSubDepartments() {
        return subDepartments;
    }

    public void setSubDepartments(List<SubDepartment> subDepartments) {
        this.subDepartments = subDepartments;
    }

    public List<JobInfo> getJobsInfo() {
        return jobsInfo;
    }

    public void setJobsInfo(List<JobInfo> jobsInfo) {
        this.jobsInfo = jobsInfo;
    }

    public int getManagement_id() {
        return management_id;
    }

    public void setManagement_id(int management_id) {
        this.management_id = management_id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subDepartments=" + subDepartments +
                ", jobsInfo=" + jobsInfo +
                ", management_id=" + management_id +
                '}';
    }
}

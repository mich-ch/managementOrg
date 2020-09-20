package gr.ots.managementOrg.model;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Management {
    private int id;
    private String name;
    private String address;
    private String location;
    private String description;
    private List<Department> departments;
    private List<JobInfo> jobsInfo;

    public Management(int id, String name, String address, String location, String description, List<Department> departments, List<JobInfo> jobsInfo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.description = description;
        this.departments = departments;
        this.jobsInfo = jobsInfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<JobInfo> getJobsInfo() {
        return jobsInfo;
    }

    public void setJobsInfo(List<JobInfo> jobsInfo) {
        this.jobsInfo = jobsInfo;
    }
}

package gr.ots.managementOrg.model;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class SubDepartment {
    private long id;
    private String name;
    private List<JobInfo> jobsInfo;
    private int department_id;

    public SubDepartment(long id, String name, List<JobInfo> jobsInfo, int department_id) {
        this.id = id;
        this.name = name;
        this.jobsInfo = jobsInfo;
        this.department_id = department_id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobInfo> getJobsInfo() {
        return jobsInfo;
    }

    public void setJobsInfo(List<JobInfo> jobsInfo) {
        this.jobsInfo = jobsInfo;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}

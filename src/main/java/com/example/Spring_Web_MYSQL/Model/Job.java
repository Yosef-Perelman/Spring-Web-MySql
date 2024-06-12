package com.example.Spring_Web_MYSQL.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity // This tells Hibernate to make a table out of this class
public class Job {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Id")
    private Integer Id;

    @Column(name="Date")
    private String Date;

    @Column(name="Company_Name")
    private String Company_Name;

    @Column(name="Job_Title")
    private String Job_Title;

    @Column(name="Link")
    private String Link;

    @Column(name="through_whom")
    private String Through_Whom;

    @Column(name="Comments")
    private String Comments;

    public Job() {}

    public Job(String company_Name, String job_Title, String link, String through_whom, String comments) {
        Company_Name = company_Name;
        Job_Title = job_Title;
        Link = link;
        Through_Whom = through_whom;
        Comments = comments;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String company_Name) {
        Company_Name = company_Name;
    }

    public String getJob_Title() {
        return Job_Title;
    }

    public void setJob_Title(String job_Title) {
        Job_Title = job_Title;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getThrough_Whom() {
        return Through_Whom;
    }

    public void setThrough_Whom(String through_Whom) {
        Through_Whom = through_Whom;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    @Override
    public String toString() {
        return "Job{" +
                "Id=" + Id +
                ", Date='" + Date + '\'' +
                ", Company_Name='" + Company_Name + '\'' +
                ", Job_Title='" + Job_Title + '\'' +
                ", Link='" + Link + '\'' +
                ", Through_Whom='" + Through_Whom + '\'' +
                ", Comments='" + Comments + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(Id, job.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}

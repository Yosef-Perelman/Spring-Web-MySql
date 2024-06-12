package com.example.Spring_Web_MYSQL.Service;

import com.example.Spring_Web_MYSQL.Model.Job;
import com.example.Spring_Web_MYSQL.ModelAttribute.JobModelAttribute;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobsServiceInterface {

    void add_job(Job job);

    void delete_job(int id);

    List<Job> find_all_jobs();

}

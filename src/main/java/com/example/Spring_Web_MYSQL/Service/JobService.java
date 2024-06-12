package com.example.Spring_Web_MYSQL.Service;

import com.example.Spring_Web_MYSQL.Model.Job;
import com.example.Spring_Web_MYSQL.ModelAttribute.JobModelAttribute;
import com.example.Spring_Web_MYSQL.Repository.JobRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class JobService implements JobsServiceInterface{

    private JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public void add_job(Job job){
        jobRepository.save(job);
    }

    @Override
    public void delete_job(int id){
        jobRepository.deleteById(id);
    }

    @Override
    public List<Job> find_all_jobs(){
        List<Job> resultList = new ArrayList<>();
        jobRepository.findAll().forEach(resultList::add);
        return resultList;
    }
}

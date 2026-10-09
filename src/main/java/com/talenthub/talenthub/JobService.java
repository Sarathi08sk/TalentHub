
package com.talenthub.talenthub;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Create Job
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    // Get All Jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // Get Job By ID
    public Job getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() ->
                    new UserNotFoundException(
                        "Job not found with ID: " + id));
    }

    // Update Job
    public Job updateJob(Long id, Job updatedJob) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() ->
                    new UserNotFoundException(
                        "Job not found with ID: " + id));

        job.setTitle(updatedJob.getTitle());
        job.setCompany(updatedJob.getCompany());
        job.setLocation(updatedJob.getLocation());
        job.setDescription(updatedJob.getDescription());
        job.setSalary(updatedJob.getSalary());

        return jobRepository.save(job);
    }

    // Delete Job
    public void deleteJob(Long id) {
        Job job = jobRepository.findById(id)
                .orElseThrow(() ->
                    new UserNotFoundException(
                        "Job not found with ID: " + id));

        jobRepository.delete(job);
    }
}

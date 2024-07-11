/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joa.spring.batch.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Joaquín
 */
@RestController
@RequestMapping("/jobs")
public class JobController {
   @Autowired
    private JobLauncher jobLauncher;
   
   @Autowired 
    private Job job;

   @PostMapping("importCustomers")
   private void importCsvToBDJob(){
       JobParameters jobParameters = new JobParametersBuilder()
               .addLong("startAt", System.currentTimeMillis()).toJobParameters();
       try {
           jobLauncher.run(job, jobParameters);
       } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException ex) {
           Logger.getLogger(JobController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}

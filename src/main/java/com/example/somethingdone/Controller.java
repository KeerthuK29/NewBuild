package com.example.somethingdone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    StudentRepository stdRepo;
    @GetMapping("/lists")
    public List<Student> getStudents() {
        List<Student> allstudents = stdRepo.findAll();
        return allstudents;
    }
    @PostMapping("/student/add")
    public void createStudent(@RequestBody Student student){
        stdRepo.save(student);
    }
    @PutMapping("/students/update/{RollNo}")
   public String changeDetails(@PathVariable("RollNo") int RollNo, @RequestBody Student std) {
       Student student=stdRepo.findById(RollNo).get();
            student.setName(std.getName());
                student.setDepartment(std.getDepartment());
                student.setDOB(std.getDOB());
                student.setBloodGroup(std.getBloodGroup());
                stdRepo.save(student);
              return "Details Updated Successfully";
            }


    @DeleteMapping("/students/delete/{RollNo}")
    public String deleteDetails(@PathVariable("RollNo") int RollNo){
        Student student=stdRepo.findById(RollNo).get();
        stdRepo.delete(student);
        return "Deleted Successfully";
    }
}
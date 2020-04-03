package com.example.Eduinstitute.repositry;

import com.example.Eduinstitute.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepository extends JpaRepository <Course,Long>{


}

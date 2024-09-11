package org.tp.fullstack.Student.Management_FSD.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tp.fullstack.Student.Management_FSD.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}

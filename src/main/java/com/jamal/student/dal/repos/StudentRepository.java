/**
 * 
 */
package com.jamal.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.jamal.student.dal.entities.Student;

/**
 * @author Admin
 *
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

}

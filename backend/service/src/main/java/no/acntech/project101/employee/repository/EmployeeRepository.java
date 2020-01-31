package no.acntech.project101.employee.repository;

import no.acntech.project101.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //@Query("Select COMPANY_NAME FROM COMPANY where COMAPNY_NAME = name")
    //String customSQL(String name);

}

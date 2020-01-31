package no.acntech.project101.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import no.acntech.project101.company.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    //@Query("Select COMPANY_NAME FROM COMPANY where COMAPNY_NAME = name")
    //String customSQL(String name);

}

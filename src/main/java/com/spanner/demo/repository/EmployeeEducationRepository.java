package com.spanner.demo.repository;

import java.util.List;

import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;
import org.springframework.cloud.gcp.data.spanner.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spanner.demo.entity.EmployeeEducation;


@RepositoryRestResource(collectionResourceRel = "empeducations", path = "empeducations")
public interface EmployeeEducationRepository  extends SpannerRepository<EmployeeEducation, String> { 

	@Query("SELECT * from empeducations where  empId= @empId")
	List<EmployeeEducation> getEmployeeEducations(@Param("empId") String id);

}

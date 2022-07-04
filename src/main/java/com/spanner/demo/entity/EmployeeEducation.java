package com.spanner.demo.entity;

import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Data
@lombok.Getter
@lombok.Setter
@lombok.Builder
@lombok.ToString
@Table(name = "empeducations")
public class EmployeeEducation {

	@PrimaryKey(keyOrder = 1)
	@Column(name = "empId")
	private String empId;

	
	@PrimaryKey(keyOrder = 2)
	@Column(name = "eduId")
	private String eduId;

	@Column(name = "qualification")
	private String qualification;

	@Column(name = "grade")
	private String grade;

	@Column(name = "createdOn")
	private String createdOn;

	@Column(name = "modifiedOn")	
	private String modifiedOn;

}

package com.spanner.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Data
@lombok.Getter
@lombok.Setter
@lombok.Builder
@lombok.ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeEducationDto {

	@JsonProperty(value = "eduId")
	@JsonIgnore
	private String eduId;
	
	@JsonProperty(value = "qualification")
	private String qualification;

	@JsonProperty(value = "grade")
	private String grade;
	 
	@JsonIgnore
	public void setEduId(String eduId)
	{
		this.eduId=eduId;
	}
}

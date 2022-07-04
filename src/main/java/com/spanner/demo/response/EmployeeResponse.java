package com.spanner.demo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spanner.demo.util.APIResponse;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Data
@lombok.Getter
@lombok.Setter
@lombok.Builder
@lombok.ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeResponse extends APIResponse {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("statusCode")
	private int statusCode;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("statusMessage")
	private Object message;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("errorMessage")
	private Object errors;

}
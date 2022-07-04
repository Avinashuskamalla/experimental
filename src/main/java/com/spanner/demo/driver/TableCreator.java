package com.spanner.demo.driver;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.data.spanner.core.admin.SpannerDatabaseAdminTemplate;
import org.springframework.cloud.gcp.data.spanner.core.admin.SpannerSchemaUtils;
import org.springframework.stereotype.Component;
import com.spanner.demo.entity.Employee;
import com.spanner.demo.entity.EmployeeEducation;

@Component
public class TableCreator {

	@Autowired
	private SpannerSchemaUtils spannerSchemaUtils;

	@Autowired
	private SpannerDatabaseAdminTemplate spannerDatabaseAdminTemplate;

	public void createTables() {

		if (!this.spannerDatabaseAdminTemplate.tableExists("employee"))
			this.spannerDatabaseAdminTemplate.executeDdlStrings(Arrays.asList(this.spannerSchemaUtils.getCreateTableDdlString(Employee.class)), true);

		if (!this.spannerDatabaseAdminTemplate.tableExists("empeducations"))
			this.spannerDatabaseAdminTemplate.executeDdlStrings(Arrays.asList(this.spannerSchemaUtils.getCreateTableDdlString(EmployeeEducation.class)), true);

	}

}

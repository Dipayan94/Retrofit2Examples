package org.demo.backend.core.endpoints;

import org.demo.backend.core.models.response.employee.EmployeesResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeOperations {

    @GET("employees")
    public Call<EmployeesResponseBody> getListOfEmployees();
}

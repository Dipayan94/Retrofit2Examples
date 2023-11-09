package org.demo.tests;

import org.demo.backend.core.BaseRetrofitGenerator;
import org.demo.backend.core.Constants;
import org.demo.backend.core.endpoints.EmployeeOperations;
import org.demo.backend.core.models.response.employee.EmployeesResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class EmployeeOperationsTest {

    @Test
    public void getAllEmployeesTest() throws IOException {
        //Initiate the Retrofit Base Instance
        BaseRetrofitGenerator baseRetrofitGenerator = new BaseRetrofitGenerator();
        //Get the Endpoint instance using retrofit instance
        EmployeeOperations employeeOperations = baseRetrofitGenerator
                .getRetrofitInstanceForEndpoint(EmployeeOperations.class, Constants.BASE_URL_DUMMY_REST);

        //Get the request operation
        Call<EmployeesResponseBody> call = employeeOperations.getListOfEmployees();
        //Send the request
        Response<EmployeesResponseBody> response = call.execute();

        //Verify & Assert the Response
        System.out.println("received status code : " + response.code());
        Assert.assertEquals(response.code(), 200);
        System.out.println("received first employee id :" + response.body().getData().get(0).getId());
        Assert.assertTrue(!response.body().getData().get(0).getId().isEmpty());
    }
}

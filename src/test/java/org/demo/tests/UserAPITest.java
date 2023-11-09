package org.demo.tests;

import org.demo.backend.core.BaseRetrofitGenerator;
import org.demo.backend.core.Constants;
import org.demo.backend.core.endpoints.UsersApi;
import org.demo.backend.core.models.request.CreateUserRequestBody;
import org.demo.backend.core.models.response.CreateUserResponseBody;
import org.demo.backend.core.models.response.SingleUserResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class UserAPITest {

    @Test
    public void getSingleUserTest() throws IOException {
        BaseRetrofitGenerator baseRetrofitGenerator = new BaseRetrofitGenerator();
        UsersApi usersApi = baseRetrofitGenerator.getRetrofitInstanceForEndpoint(UsersApi.class, Constants.BASE_URL_REQ_RES);

        Call<SingleUserResponse> call = usersApi.getSingleUser();
        Response<SingleUserResponse> response = call.execute();
        System.out.println("received status code : " + response.code());
        Assert.assertEquals(response.code(), 200);
        System.out.println("received user id :" + response.body().getData().getId());
        Assert.assertTrue(!response.body().getData().getId().isEmpty());
    }

    @Test
    public void createUserTest() throws IOException {
        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody();
        createUserRequestBody.setJob("morpheus");
        createUserRequestBody.setName("leader");

        BaseRetrofitGenerator baseRetrofitGenerator = new BaseRetrofitGenerator();
        UsersApi usersApi = baseRetrofitGenerator.getRetrofitInstanceForEndpoint(UsersApi.class, Constants.BASE_URL_REQ_RES);

        Call<CreateUserResponseBody> call = usersApi.createUserWithPost(createUserRequestBody);
        Response<CreateUserResponseBody> response = call.execute();
        System.out.println("received status code : " + response.code());
        Assert.assertEquals(response.code(), 201);
        Assert.assertNotNull(response.body());
    }
}

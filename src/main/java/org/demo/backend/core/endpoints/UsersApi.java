package org.demo.backend.core.endpoints;

import org.demo.backend.core.models.request.CreateUserRequestBody;
import org.demo.backend.core.models.response.CreateUserResponseBody;
import org.demo.backend.core.models.response.SingleUserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UsersApi {

    @POST("/api/users")
    public Call<CreateUserResponseBody> createUserWithPost(@Body CreateUserRequestBody request);

    @GET("/api/users/2")
    public Call<SingleUserResponse> getSingleUser();

}

package org.demo.backend.core.models.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CreateUserResponseBody {
    public String name;
    public String job;
    public String id;
    public Date createdAt;
}

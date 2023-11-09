package org.demo.backend.core.models.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//@Builder
@Getter
@Setter
public class CreateUserRequestBody {
    public String name;
    public String job;
}

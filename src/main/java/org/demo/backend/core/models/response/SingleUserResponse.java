package org.demo.backend.core.models.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleUserResponse {

    public data data;
    public support support;

    @Getter
    @Setter
    public class data {
        public String id;
        public String email;
        public String first_name;
        public String last_name;
        public String avatar;
    }

    @Getter
    @Setter
    public class support {
        public String url;
        public String text;
    }
}

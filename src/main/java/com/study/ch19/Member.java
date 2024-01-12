package com.study.ch19;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Member {
    public String name;
    public String phone;
}

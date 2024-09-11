package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Ship {
    public String from;
    public String to;
}

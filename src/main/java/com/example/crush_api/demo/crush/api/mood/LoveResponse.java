package com.example.crush_api.demo.crush.api.mood;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoveResponse {

    private String name1;
    private String name2;
    private int percentage;
    private String message;

}

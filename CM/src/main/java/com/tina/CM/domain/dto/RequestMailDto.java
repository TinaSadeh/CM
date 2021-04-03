package com.tina.CM.domain.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RequestMailDto implements Serializable {
    private long receiverId;
    private String title;
    private String content;

}

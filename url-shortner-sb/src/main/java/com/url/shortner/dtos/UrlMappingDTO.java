package com.url.shortner.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class UrlMappingDTO {
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdDate;
    private String username;
}
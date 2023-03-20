package com.zerobase.fastlms.banner.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BannerInput {
    long id;

    private String title;
    private String replaceText;
    private String filename;
    private String urlFilename;
    private String clickUrl;
    private String openTarget;
    private boolean openPost;
    private LocalDateTime registerDt;
    private int sortValue;

    //삭제를 위한
    String idList;
}

package com.zerobase.fastlms.admin.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BannerInput {
    Long id;

    String bannerName;
    String filename;
    String urlFilename;
    String url;
    String openId;
    int sortValue;
    boolean usingYn;

    LocalDate regDt;

    // 삭제를 위한
    String idList;
}

package com.zerobase.fastlms.admin.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.zerobase.fastlms.admin.entity.Banner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {
    Long id;

    String bannerName;
    String filename;
    String urlFilename;
    long openId;
    int sortValue;
    boolean usingYn;

    LocalDate regDt;
    long totalCount;
    long seq;

    public static BannerDto of(Banner banner) {
        return BannerDto.builder().id(banner.getId()).bannerName(banner.getBannerName()).filename(banner.getFilename())
                .urlFilename(banner.getFilename()).openId(banner.getOpenId()).sortValue(banner.getSortValue())
                .usingYn(banner.isUsingYn()).regDt(banner.getRegDt()).build();
    }

    public static List<BannerDto> of(List<Banner> banners) {

        if (banners == null) {
            return null;
        }

        List<BannerDto> bannerList = new ArrayList<>();
        for (Banner x : banners) {
            bannerList.add(BannerDto.of(x));
        }
        return bannerList;

        /*
         * if (banners != null) { List<BannerDto> courseList = new ArrayList<>();
         * for(Course x : banners) { courseList.add(BannerDto.of(x)); } return
         * courseList; } return null;
         */

    }

}

package com.zerobase.fastlms.admin.service;

import java.util.List;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerInput;
import com.zerobase.fastlms.admin.model.BannerParam;

public interface BannerService {
    List<BannerDto> list();

    /**
     * 배너 등록
     */
    boolean add(BannerInput parameter);

    /**
     * 배너정보수정
     */
    boolean set(BannerInput parameter);

    /**
     * 배너 목록
     */
    List<BannerDto> list(BannerParam parameter);

    /**
     * 배너 상세정보
     */
    BannerDto getById(long id);

    /**
     * 배너 내용 삭제
     */
    boolean del(String idList);

    /**
     * 전체 배너 목록
     */
    List<BannerDto> listAll();

    /**
     * 수강신청
     */
    // ServiceResult req(TakeBannerInput parameter);

    /**
     * 프론트 강좌 목록
     */
    // List<BannerDto> frontList(BannerParam parameter);

    /**
     * 프론트 강좌 상세 정보
     */
    // BannerDto frontDetail(long id);
}

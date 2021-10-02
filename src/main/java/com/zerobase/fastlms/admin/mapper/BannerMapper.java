package com.zerobase.fastlms.admin.mapper;

import java.util.List;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerParam;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BannerMapper {
    long selectListCount(BannerParam parameter);

    List<BannerDto> selectList(BannerParam parameter);
}

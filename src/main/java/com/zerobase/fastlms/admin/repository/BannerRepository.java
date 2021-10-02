package com.zerobase.fastlms.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import com.zerobase.fastlms.admin.entity.Banner;

public interface BannerRepository extends JpaRepository<Banner, Long> {
    Optional<List<Banner>> findByopenId(long openId);
}

package com.zerobase.fastlms.banner.service;

import com.zerobase.fastlms.banner.dto.BannerDto;
import com.zerobase.fastlms.banner.model.BannerInput;
import com.zerobase.fastlms.banner.model.BannerParam;

import java.util.List;

public interface BannerService {
    boolean add(BannerInput parameter);
    boolean set(BannerInput parameter);
    boolean del(String idList);
    List<BannerDto> list(BannerParam parameter);
    BannerDto getById(long id);
    List<BannerDto> frontList();
}

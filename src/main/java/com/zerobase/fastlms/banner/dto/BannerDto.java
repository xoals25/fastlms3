package com.zerobase.fastlms.banner.dto;

import com.zerobase.fastlms.banner.entity.Banner;
import com.zerobase.fastlms.member.dto.LoginLogDto;
import com.zerobase.fastlms.member.entity.LoginLog;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class BannerDto {
    long id;

    private String title;
    private String replaceText;
    private String filename;
    private String urlFilename;
    private String clickUrl;
    private String openTarget;
    private int sortValue;
    private boolean openPost;
    private LocalDateTime registerDt;

    //추가컬럼
    long totalCount;
    long seq;

    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .title(banner.getTitle())
                .replaceText(banner.getReplaceText())
                .urlFilename(banner.getUrlFilename())
                .clickUrl(banner.getClickUrl())
                .openTarget(banner.getOpenTarget())
                .sortValue(banner.getSortValue())
                .openPost(banner.isOpenPost())
                .registerDt(banner.getRegisterDt())
                .build();
    }

    public static List<BannerDto> of(List<Banner> bannerList) {
        List<BannerDto> list = new ArrayList<>();

        for (Banner banner : bannerList) {
            list.add(BannerDto.builder()
                    .id(banner.getId())
                    .title(banner.getTitle())
                    .replaceText(banner.getReplaceText())
                    .urlFilename(banner.getUrlFilename())
                    .clickUrl(banner.getClickUrl())
                    .openTarget(banner.getOpenTarget())
                    .sortValue(banner.getSortValue())
                    .openPost(banner.isOpenPost())
                    .registerDt(banner.getRegisterDt())
                    .build());
        }

        return list;
    }
}

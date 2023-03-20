package com.zerobase.fastlms.member.dto;

import com.zerobase.fastlms.member.entity.LoginLog;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LoginLogDto {
    private String userId;
    private LocalDateTime loginDt;
    private String ip;
    private String userAgent;

    //추가 칼럼
    long totalCount;
    long seq;

    public static List<LoginLogDto> of(List<LoginLog> optionalLoginLog) {
        List<LoginLogDto> list = new ArrayList<>();

        for (LoginLog item : optionalLoginLog) {
            list.add(LoginLogDto.builder()
                    .userId(item.getUserId())
                    .loginDt(item.getLoginDt())
                    .ip(item.getIp())
                    .userAgent(item.getUserAgent())
                    .build());
        }

        return list;
    }
}

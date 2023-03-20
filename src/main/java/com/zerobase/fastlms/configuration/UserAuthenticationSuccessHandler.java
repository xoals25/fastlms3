package com.zerobase.fastlms.configuration;

import com.zerobase.fastlms.member.entity.LoginLog;
import com.zerobase.fastlms.member.repository.LoginLogRepository;
import com.zerobase.fastlms.util.RequestUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@RequiredArgsConstructor
public class UserAuthenticationSuccessHandler extends
        SimpleUrlAuthenticationSuccessHandler {

    private final LoginLogRepository loginLogRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
            throws IOException, ServletException {
        loginLogRepository.save(
                LoginLog.builder()
                        .userId(authentication.getName())
                        .loginDt(LocalDateTime.now())
                        .ip(RequestUtils.getClientIP(request))
                        .userAgent(RequestUtils.getUserAgent(request))
                        .build()
        );

        super.onAuthenticationSuccess(request, response, authentication);
    }
}

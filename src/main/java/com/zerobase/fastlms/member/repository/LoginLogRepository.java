package com.zerobase.fastlms.member.repository;

import com.zerobase.fastlms.member.entity.LoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginLogRepository extends JpaRepository<LoginLog, String> {
    List<LoginLog> findAllByUserId(String userId);
}

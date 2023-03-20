package com.zerobase.fastlms.member.mapper;

import com.zerobase.fastlms.admin.model.MemberParam;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginLogMapper {
    long selectListCount(MemberParam parameter);
}

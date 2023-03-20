package com.zerobase.fastlms.member.model;

import com.zerobase.fastlms.admin.model.CommonParam;
import lombok.Data;

@Data
public class LoginLogParam extends CommonParam {
    String userId;
}

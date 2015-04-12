package com.attendmare.linux.attendmare;

/**
 * Created by linux on 12/4/15.
 */
public class LoginScreenModelImpl implements LoginScreenModel {
    AttendmareService service;

    LoginScreenModelImpl(AttendmareService service) {
        this.service = service;
    }

}

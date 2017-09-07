package com.company.project.service;
import com.company.project.model.Phone;
import com.company.project.model.PhoneLog;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2017/09/06.
 */
public interface PhoneLogService extends Service<PhoneLog> {
    void add (PhoneLog phoneLog);
}

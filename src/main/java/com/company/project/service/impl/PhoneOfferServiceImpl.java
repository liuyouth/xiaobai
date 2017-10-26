package com.company.project.service.impl;

import com.company.project.dao.PhoneOfferMapper;
import com.company.project.model.PhoneOffer;
import com.company.project.service.PhoneOfferService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/23.
 */
@Service
@Transactional
public class PhoneOfferServiceImpl extends AbstractService<PhoneOffer> implements PhoneOfferService {
    @Resource
    private PhoneOfferMapper phoneOfferMapper;

}

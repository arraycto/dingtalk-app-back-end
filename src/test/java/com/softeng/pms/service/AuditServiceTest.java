package com.softeng.pms.service;


import com.softeng.pms.repository.AcItemRepository;
import com.softeng.pms.repository.DcRecordRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * @author zhanyeye
 * @description
 * @create 12/26/2019 3:46 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@Transactional
public class AuditServiceTest {
    @Autowired
    AuditService auditService;
    @Autowired
    DcRecordRepository dcRecordRepository;
    @Autowired
    AcItemRepository acItemRepository;

    @Test
    public void test() {

    }
}
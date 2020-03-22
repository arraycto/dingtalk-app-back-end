package com.softeng.dingtalk.repository;

import com.softeng.dingtalk.entity.IterationDetail;
import com.softeng.dingtalk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author zhanyeye
 * @description
 * @date 3/14/2020
 */
public interface IterationDetailRepository extends JpaRepository<IterationDetail, Integer> {

    /**
     * 删除Iteration 的所有 iterationDetail
     * @param id 主键
     **/
    void deleteByIterationId(int id);


    @Query("select itd.user from IterationDetail itd where itd.iteration.id = :id")
    List<User> listUserByIterationId(@Param("id") int id);



}
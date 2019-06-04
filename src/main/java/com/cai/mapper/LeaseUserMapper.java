package com.cai.mapper;

import com.cai.entity.LeaseUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by caibaolong on 2019/6/4.
 */
public interface LeaseUserMapper {
    @Select(" select * from LEASE_USER ")
    List<LeaseUser> list();
}

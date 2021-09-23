package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(DealRecord DealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);
}

package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherDao")
public interface ClaimVoucherDao {
    void insert(ClaimVoucher claimVoucher);
    void update(ClaimVoucher claimVoucher);
    void delete(int id);
    ClaimVoucher select(int id);
    List<ClaimVoucher> selectByCreateSn(String sn);
    List<ClaimVoucher> selectByNextDealSn(String ndsn);
}

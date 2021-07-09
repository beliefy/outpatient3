package com.cuit.shopping.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cuit.shopping.entity.Medicine;
import com.cuit.shopping.mapper.MedicineMapper;
import org.springframework.stereotype.Service;

/**
 * @author yinzhiyang
 */
@Service
public class MedicineService extends ServiceImpl<MedicineMapper, Medicine> {
}

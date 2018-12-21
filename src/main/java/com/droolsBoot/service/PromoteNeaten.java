package com.droolsBoot.service;


import com.droolsBoot.model.PromoteExecute;
import org.springframework.stereotype.Service;

/**
 * describe: 查询业务类
 *
 * @author laizhihui
 * @date 2018/03/01
 */

@Service
public class PromoteNeaten {

    /**
     * 初始化指定的规则
     *
     * @param rule 促销实体数据
     * @return 返回值
     */
    public PromoteExecute editRule(String rule) throws RuntimeException {
        PromoteExecute promoteExecute = new PromoteExecute();
        promoteExecute.setWorkContent(rule);//促销业务规则
        //规则库 初始化
        promoteExecute.getWorkSession();
        return promoteExecute;
    }
}

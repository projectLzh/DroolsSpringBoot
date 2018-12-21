package com.droolsBoot.service;


import com.droolsBoot.model.PromoteExecute;
import com.droolsBoot.model.RuleResult;
import org.kie.internal.command.CommandFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.util.*;

/**
 * describe: 规则工具类
 *
 * @author laizhihui
 */
public class DrlExecute {
    private static DecimalFormat df = new DecimalFormat("######0.00");
    protected static Logger logger = LoggerFactory.getLogger(DrlExecute.class);
    /**
     * 判断购物车的所有商品所参加的活动
     *
     * @return 结果
     */
    static RuleResult rulePromote(PromoteExecute promoteExecute, Double moneySum) {
        // 判断业务规则是否存在
        RuleResult ruleresult = new RuleResult();
        //统计所有参活商品的件数和金额
        ruleresult.setMoneySum(moneySum);//返回优惠前的价格
        logger.info("优惠前的价格" + moneySum);
        //统计完成后再将参数insert到促销规则中
        List cmdCondition = new ArrayList<>();
        cmdCondition.add(CommandFactory.newInsert(ruleresult));
        promoteExecute.getWorkSession().execute(CommandFactory.newBatchExecution(cmdCondition));
        logger.info("优惠后的价格" + ruleresult.getFinallyMoney());
        return ruleresult;
    }
}

package com.droolsBoot.util;

/**
 * describe:
 *
 * @author laizhihui
 * @date 2018/04/25
 */
public class LossMoneyTemplate {
    public static final String workMoneyST = "wordImport(rules) ::=<<\n" +
            "package com.promote\n" +
            "\n" +
            "import\tcom.droolsBoot.model.RuleResult;\n" +
            "<rules; separator=\"\\n\\n\">\n" +
            ">>\n" +
            "\n" +
            "ruleValue(condition,action,rule) ::=<<\n" +
            "rule \"<rule.name>\"\n" +
            "\tno-loop true\n" +
            "\t\twhen\n" +
            "\t\t    $r:RuleResult(true)\n" +
            " \t\tthen\n" +
            "           modify($r){\n" +
            "                setPromoteName(drools.getRule().getName())<if(action)>,\n" +
            "                setFinallyMoney($r.getMoneySum() - <action.money><endif>)\n" +
            "           }\n" +
            "end\n" +
            ">>\n";
}

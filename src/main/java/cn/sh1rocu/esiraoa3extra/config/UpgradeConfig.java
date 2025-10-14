package cn.sh1rocu.esiraoa3extra.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.math.BigDecimal;

/**
 * @author lyq
 * @createDate 2025/10/11
 */
public class UpgradeConfig {

    public static ForgeConfigSpec COMMON_CONFIG;
    //强化石无星级默认等级
    public static ForgeConfigSpec.ConfigValue<Integer> StrengthenDefaultLevel;
    //摘星手倍率
    public static ForgeConfigSpec.ConfigValue<String> MinimumGuaranteeRate;
    //双倍概率
    public static ForgeConfigSpec.ConfigValue<String> BonusRate;
    //成功概率系数
    public static ForgeConfigSpec.ConfigValue<String> SuccessCoefficient;
    //失败概率系数
    public static ForgeConfigSpec.ConfigValue<String> FailureCoefficient;
    //不变概率系数
    public static ForgeConfigSpec.ConfigValue<String> ConstantCoefficient;
    //损坏概率系数
    public static ForgeConfigSpec.ConfigValue<String> DamagedCoefficient;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("esir强化机制配置文件").push("ESIR强化概率配置表");
        StrengthenDefaultLevel = COMMON_BUILDER.comment("强化石无星级默认等级").defineInRange("StrengthenDefaultLevel", 3, 0, Integer.MAX_VALUE);
        MinimumGuaranteeRate = COMMON_BUILDER.comment("摘星手倍率").define("MinimumGuaranteeRate", "0.003f");
        BonusRate = COMMON_BUILDER.comment("双倍概率").define("BonusRate", "0.02f");
        SuccessCoefficient = COMMON_BUILDER.comment("成功概率系数").define("SuccessCoefficient", "0.7f");
        FailureCoefficient = COMMON_BUILDER.comment("失败概率系数").define("FailureCoefficient", "1f");
        ConstantCoefficient = COMMON_BUILDER.comment("不变概率系数").define("ConstantCoefficient", "5f");
        DamagedCoefficient = COMMON_BUILDER.comment("损坏概率系数").define("DamagedCoefficient", "0.5f");
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

}

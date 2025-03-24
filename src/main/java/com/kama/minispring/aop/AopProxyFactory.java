package com.kama.minispring.aop;
/**
 * AOP代理工厂接口
 * 负责创建AOP代理对象
 * 
 *
 */
public interface AopProxyFactory {
    /**
     * 创建AOP代理
     * 
     * @param config AOP配置
     * @return AOP代理
     */
    AopProxy createAopProxy(AdvisedSupport config);
} 
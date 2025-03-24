package com.kama.minispring.context;
import com.kama.minispring.beans.factory.Aware;
/**
 * ApplicationContext感知接口
 * 实现该接口的Bean可以获取ApplicationContext实例
 *
 *
 *
 */
public interface ApplicationContextAware extends Aware {
    /**
     * 设置ApplicationContext
     *
     * @param applicationContext ApplicationContext实例
     */
    void setApplicationContext(ApplicationContext applicationContext);
} 
package com.cracker.springframework.beans.factory.config;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);


    /**
     * 销毁单例对象
     */
    void destroySingletons();
}
                                                
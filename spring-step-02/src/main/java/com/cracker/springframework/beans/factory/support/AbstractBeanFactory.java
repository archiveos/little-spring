package com.cracker.springframework.beans.factory.support;

import com.cracker.springframework.beans.BeansException;
import com.cracker.springframework.beans.factory.BeanFactory;
import com.cracker.springframework.beans.factory.config.BeanDefinition;

/**
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * BeanDefinition 注册表接口
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}

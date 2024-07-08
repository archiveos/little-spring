package com.cracker.springframework.beans.factory;

import com.cracker.springframework.beans.BeansException;
import com.cracker.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.cracker.springframework.beans.factory.config.BeanDefinition;
import com.cracker.springframework.beans.factory.config.BeanPostProcessor;
import com.cracker.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 *
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}

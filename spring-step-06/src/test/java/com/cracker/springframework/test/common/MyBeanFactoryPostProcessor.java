package com.cracker.springframework.test.common;

import com.cracker.springframework.beans.BeansException;
import com.cracker.springframework.beans.PropertyValue;
import com.cracker.springframework.beans.PropertyValues;
import com.cracker.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.cracker.springframework.beans.factory.config.BeanDefinition;
import com.cracker.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}

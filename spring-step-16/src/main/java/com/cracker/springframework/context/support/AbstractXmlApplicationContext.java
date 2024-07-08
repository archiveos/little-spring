package com.cracker.springframework.context.support;

import com.cracker.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.cracker.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Convenient base class for {@link com.cracker.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link com.cracker.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 *
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}

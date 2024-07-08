package com.cracker.springframework.beans.factory;

import com.cracker.springframework.beans.BeansException;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}

package com.cracker.springframework.beans.factory;

import com.cracker.springframework.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}

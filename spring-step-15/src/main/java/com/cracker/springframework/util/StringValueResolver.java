package com.cracker.springframework.util;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link com.cracker.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * <p>
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}

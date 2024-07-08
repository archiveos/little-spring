package com.cracker.springframework.context.support;

import com.cracker.springframework.beans.factory.FactoryBean;
import com.cracker.springframework.beans.factory.InitializingBean;
import com.cracker.springframework.core.convert.ConversionService;
import com.cracker.springframework.core.convert.converter.Converter;
import com.cracker.springframework.core.convert.converter.ConverterFactory;
import com.cracker.springframework.core.convert.converter.ConverterRegistry;
import com.cracker.springframework.core.convert.converter.GenericConverter;
import com.cracker.springframework.core.convert.support.DefaultConversionService;
import com.cracker.springframework.core.convert.support.GenericConversionService;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * A factory providing convenient access to a ConversionService configured with
 * converters appropriate for most environments. Set the
 * setConverters "converters" property to supplement the default converters.
 *
 * 提供创建 ConversionService 工厂
 *
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    @Nullable
    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }

}

package com.morgan.design.properties.conversion;

import java.lang.reflect.Field;

import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Default implementation of {@link PropertyConversionService}, attempting to convert an object otherwise utilising {@link SimpleTypeConverter} if no matching
 * converter is found.
 * 
 * @author James Morgan
 */
@Component
public class DefaultPropertyConversionService implements PropertyConversionService {

	@Autowired
	private ConfigurableBeanFactory cbf;

	@Override
	public Object convertPropertyForField(final Field field, final Object property) {
		try {
			return cbf.getTypeConverter().convertIfNecessary(property, field.getType());
		}
		catch (final Throwable e) {
			throw new BeanInitializationException(String.format("Unable to convert property for field [%s].  Value [%s] cannot be converted to [%s]",
					field.getName(), property, field.getType()), e);
		}
	}

}

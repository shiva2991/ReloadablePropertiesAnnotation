package com.morgan.design.properties.conversion;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DefaultPropertyConversionServiceUnitTest {

	private PropertyConversionService conversionService;

	@Before
	public void setUp() throws Exception {
		this.conversionService = new DefaultPropertyConversionService();
	}

	@Test
	public void shouldConvertBooleanValue() throws NoSuchFieldException, SecurityException {
		assertThat((Boolean) convertPropertyForField("booleanValue", "true"), is(true));
	}

	static class TestObject {
		Date date;
		boolean booleanValue;
	}

	private Object convertPropertyForField(final String fieldName, final Object value) throws NoSuchFieldException, SecurityException {
		return this.conversionService.convertPropertyForField(TestObject.class.getDeclaredField(fieldName), value);
	}
}

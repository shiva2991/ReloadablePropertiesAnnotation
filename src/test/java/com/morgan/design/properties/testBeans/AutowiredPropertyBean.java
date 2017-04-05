package com.morgan.design.properties.testBeans;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.stereotype.Component;

import com.morgan.design.properties.ReloadableProperty;

@Component
public class AutowiredPropertyBean {

	private String notAnnotated = "Original value";

	@ReloadableProperty("not.in.the.file")
	private String withDefaultValue = "Default Value";

	@ReloadableProperty("not.in.the.file")
	private int primitiveWithDefaultValue = 55;

	@ReloadableProperty("dynamicProperty.stringValue")
	private String stringProperty;

	// primitives

	@ReloadableProperty("dynamicProperty.booleanValue")
	private boolean booleanProperty;

	@ReloadableProperty("dynamicProperty.intValue")
	private int intProperty;

	@ReloadableProperty("dynamicProperty.longValue")
	private long longProperty;

	@ReloadableProperty("dynamicProperty.doubleValue")
	private double doubleProperty;

	// object wrappers

	@ReloadableProperty("dynamicProperty.intValue")
	private Integer intObjectProperty;

	@ReloadableProperty("dynamicProperty.longValue")
	private Long longObjectProperty;

	@ReloadableProperty("dynamicProperty.doubleValue")
	private Double doubleObjectProperty;

	// math

	@ReloadableProperty("dynamicProperty.bigIntegerValue")
	private BigInteger bigIntegerProperty;

	@ReloadableProperty("dynamicProperty.bigDecimalValue")
	private BigDecimal bigDecimalProperty;

	// recursive substitution

	@ReloadableProperty("dynamicProperty.substitutionProperty")
	private String substitutedProperty;

	// getters/setters

	public String getNotAnnotated() {
		return this.notAnnotated;
	}

	public String getWithDefaultValue() {
		return this.withDefaultValue;
	}

	public int getPrimitiveWithDefaultValue() {
		return this.primitiveWithDefaultValue;
	}

	public String getStringProperty() {
		return this.stringProperty;
	}

	public boolean getBooleanProperty() {
		return this.booleanProperty;
	}

	public int getIntProperty() {
		return this.intProperty;
	}

	public long getLongProperty() {
		return this.longProperty;
	}

	public double getDoubleProperty() {
		return this.doubleProperty;
	}

	public Double getDoubleObjectProperty() {
		return this.doubleObjectProperty;
	}

	public Integer getIntObjectProperty() {
		return this.intObjectProperty;
	}

	public Long getLongObjectProperty() {
		return this.longObjectProperty;
	}

	public BigDecimal getBigDecimalProperty() {
		return this.bigDecimalProperty;
	}

	public BigInteger getBigIntegerProperty() {
		return this.bigIntegerProperty;
	}

	public String getSubstitutedProperty() {
		return this.substitutedProperty;
	}

}

package com.morgan.design.properties.bean;

import java.lang.reflect.Field;
import java.util.Arrays;

public class BeanPropertyHolder {

	private final Object bean;
	private final Field field;

	public BeanPropertyHolder(Object bean, Field field) {
		this.bean = bean;
		this.field = field;
	}

	public Object getBean() {
		return this.bean;
	}

	public Field getField() {
		return this.field;
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(new Object[]{this.bean, this.field});
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof BeanPropertyHolder) {
			BeanPropertyHolder that = (BeanPropertyHolder) object;
			return (this.bean == that.getBean() || this.bean.equals(that.getBean()))
					&& (this.field == that.getField() || this.field.equals(that.getField()));
		}
		return false;
	}

	@Override
	public String toString() {
		return "BeanPropertyHolder [bean=" + bean + ", field=" + field + "]";
	}

}

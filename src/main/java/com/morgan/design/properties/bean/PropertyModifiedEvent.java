package com.morgan.design.properties.bean;

public class PropertyModifiedEvent {

	private final String propertyName;
	private final Object oldValue;
	private final Object newValue;

	public PropertyModifiedEvent(final String propertyName, final Object oldValue, final Object newValue) {
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public Object getOldValue() {
		return this.oldValue;
	}

	public Object getNewValue() {
		return this.newValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((newValue == null) ? 0 : newValue.hashCode());
		result = prime * result + ((oldValue == null) ? 0 : oldValue.hashCode());
		result = prime * result + ((propertyName == null) ? 0 : propertyName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertyModifiedEvent other = (PropertyModifiedEvent) obj;
		if (newValue == null) {
			if (other.newValue != null)
				return false;
		} else if (!newValue.equals(other.newValue))
			return false;
		if (oldValue == null) {
			if (other.oldValue != null)
				return false;
		} else if (!oldValue.equals(other.oldValue))
			return false;
		if (propertyName == null) {
			if (other.propertyName != null)
				return false;
		} else if (!propertyName.equals(other.propertyName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PropertyModifiedEvent [propertyName=" + propertyName + ", oldValue=" + oldValue + ", newValue="
				+ newValue + "]";
	}
}

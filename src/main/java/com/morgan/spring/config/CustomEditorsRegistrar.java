package com.morgan.spring.config;

import java.beans.PropertyEditor;
import java.util.Map;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomEditorsRegistrar implements PropertyEditorRegistrar
{
	private final Map<Class<?>, PropertyEditor> extraEditors;
	
	@Autowired
	public CustomEditorsRegistrar(Map<Class<?>, PropertyEditor> extraEditors) {
		this.extraEditors = extraEditors;
	}
	
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		if(extraEditors != null)
		{
			for (Map.Entry<Class<?>, PropertyEditor> e : extraEditors.entrySet()) {
				registry.registerCustomEditor(e.getKey(), e.getValue());
			}
		}
	}

}

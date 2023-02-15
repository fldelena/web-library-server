package com.soslanzagagov.springrest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Конфигурация диспетчер сервлета
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

//    url адрес для диспетчер сервлета
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

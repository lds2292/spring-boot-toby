package com.example.hellospring.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigurationImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "com.example.hellospring.config.autoconfig.DispatcherServletConfig",
                "com.example.hellospring.config.autoconfig.TomcatWebServerConfig"
        };
    }
}

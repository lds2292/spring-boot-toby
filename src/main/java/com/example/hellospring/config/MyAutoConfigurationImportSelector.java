package com.example.hellospring.config;

import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

public class MyAutoConfigurationImportSelector implements DeferredImportSelector {

    private final ClassLoader classLoader;

    public MyAutoConfigurationImportSelector(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    @NonNull
    public String[] selectImports(@NonNull AnnotationMetadata importingClassMetadata) {
        List<String> autoConfigs = new ArrayList<>();
        ImportCandidates.load(MyAutoConfiguration.class, classLoader).forEach(autoConfigs::add);
        return autoConfigs.toArray(new String[0]);
    };
}

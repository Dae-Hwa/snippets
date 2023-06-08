package com.snippetsexamples.springs.enums.enuminjection;

import jakarta.annotation.PostConstruct;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

enum InjectionTargetEnum {

    ENUM_VALUE_1;

    private static Environment environment;

    public static String[] activeProfiles() {
        return environment.getActiveProfiles();
    }

    @Component
    private static class InjectionTargetEnumInjector {

        private final Environment environment;

        public InjectionTargetEnumInjector(Environment environment) {
            this.environment = environment;
        }

        @PostConstruct
        private void postConstruct() {
            InjectionTargetEnum.environment = this.environment;
        }
    }
}

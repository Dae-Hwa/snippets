package com.snippetsexamples.springs.enums.enuminjection;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class InjectionTargetEnumTest {

    @Test
    void activeProfiles() {
        assertThat(InjectionTargetEnum.activeProfiles())
                .contains("test1", "test2");
    }
}
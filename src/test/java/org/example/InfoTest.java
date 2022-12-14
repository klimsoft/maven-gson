package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InfoTest {

    @Test
    public void shouldConvertToJson() {
        String expected = "{\"author\":\"Author\",\"version\":\"Version\",\"year\":\"2000\"}";
        Info info = new Info("Author", "Version", "2000");
        //TODO better to compare JsonElement objects
        Assertions.assertThat(info.toJson()).isEqualTo(expected);
    }

}
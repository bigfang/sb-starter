package io.fang.starter.support;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public abstract class AbstractEntity {
    private Long id;

    private OffsetDateTime createdAt;

    private OffsetDateTime updatedAt;
}

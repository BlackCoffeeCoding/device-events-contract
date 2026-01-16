package org.blackcoffeecoding.device.events;

import java.io.Serializable;

public record DeviceRatedEvent(
        Long deviceId,
        Integer score,
        String verdict
) implements Serializable {}
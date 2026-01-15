package org.blackcoffeecoding.device.events;

import java.io.Serializable;

public record DeviceCreatedEvent(
        Long id,
        String name,
        String serialNumber,
        String category
) implements Serializable {}
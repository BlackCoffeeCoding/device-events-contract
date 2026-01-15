package org.blackcoffeecoding.device.events;

import java.io.Serializable;

public record DeviceDeletedEvent(
        Long id
) implements Serializable {}
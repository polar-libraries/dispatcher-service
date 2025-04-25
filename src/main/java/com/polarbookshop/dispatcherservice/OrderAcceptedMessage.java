package com.polarbookshop.dispatcherservice;

import java.io.Serializable;

public record OrderAcceptedMessage (
        Long orderId
) implements Serializable {

}

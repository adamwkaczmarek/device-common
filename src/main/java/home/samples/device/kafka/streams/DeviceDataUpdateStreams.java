package home.samples.device.kafka.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface DeviceDataUpdateStreams {

    String INPUT = "device-data-update-in";
    String OUTPUT = "device-data-update-out";

    @Input(INPUT)
    SubscribableChannel inboundDeviceDataUpdate();

    @Output(OUTPUT)
    MessageChannel outboundDeviceDataUpdate();
}

package es.in2.blockchain.connector.integration.orionld.controller;

import es.in2.blockchain.connector.core.service.OnChainEntityService;
import es.in2.blockchain.connector.integration.orionld.domain.OrionLdNotificationDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/notifications/orion-ld")
@RequiredArgsConstructor
public class OrionLdNotificationController {

    private final OnChainEntityService onChainEntityService;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> orionLdNotification(@RequestBody OrionLdNotificationDTO orionLdNotificationDTO) {
        log.debug("Notification received: {}", orionLdNotificationDTO.toString());

        return Mono.fromRunnable(() -> onChainEntityService.createAndPublishEntityToOnChain(orionLdNotificationDTO)).then();
    }


}

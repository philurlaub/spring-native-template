package de.ppaul

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
class MetadataController(
        val metadataRepository: MetadataRepository
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/")
    fun something(): Flux<Metadata> {
        log.info("running GET")
        return metadataRepository.findAll()
    }

    @PostMapping("/")
    fun writeSomething(metadata: Metadata): Mono<Metadata> {
        log.info("running POST")
        return metadataRepository.save(metadata)
    }
}
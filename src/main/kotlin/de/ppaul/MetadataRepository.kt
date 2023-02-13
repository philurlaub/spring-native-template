package de.ppaul

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MetadataRepository : ReactiveCrudRepository<Metadata, UUID> {
}
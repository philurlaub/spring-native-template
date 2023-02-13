package de.ppaul

import java.util.UUID

data class Metadata(
        val datasetId: UUID,
        val datasetName: String,
        val datasetType: String
)

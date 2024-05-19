package dev.eknath.logger.EkhaLogger.model

import java.util.Date
import java.util.UUID

class LogGetModel(
    val logId: String,
    val title: String,
    val description: String,
    val date: Date
)
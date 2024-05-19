package dev.eknath.logger.EkhaLogger.model

import dev.eknath.logger.EkhaLogger.repository.model.LogDBModel
import org.springframework.web.bind.annotation.ModelAttribute

class LogModel(
    val title: String,
    val description: String
)

fun LogModel.toDBModel() = LogDBModel(
    title = this.title,
    description = this.description
)
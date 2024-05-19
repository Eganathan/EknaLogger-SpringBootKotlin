package dev.eknath.logger.EkhaLogger.repository.model

import dev.eknath.logger.EkhaLogger.model.LogGetModel
import dev.eknath.logger.EkhaLogger.model.LogModel
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.*

@Entity
class LogDBModel(
    val title: String,
    val description: String,
) {

    @Id
    @GeneratedValue
    var logId: UUID? = null
        private set

    val date = Date()
}

fun LogDBModel.toLogGetModel() = LogGetModel(
    logId = logId.toString(),
    title = this.title,
    description = this.description,
    date = this.date
)
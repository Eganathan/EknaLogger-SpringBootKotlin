package dev.eknath.logger.EkhaLogger.repository

import dev.eknath.logger.EkhaLogger.repository.model.LogDBModel
import org.springframework.data.repository.CrudRepository
import java.util.UUID


interface LoggerRepository : CrudRepository<LogDBModel, UUID>
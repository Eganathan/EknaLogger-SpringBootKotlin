package dev.eknath.logger.EkhaLogger.controller

import dev.eknath.logger.EkhaLogger.model.LogGetModel
import dev.eknath.logger.EkhaLogger.model.LogModel
import dev.eknath.logger.EkhaLogger.model.toDBModel
import dev.eknath.logger.EkhaLogger.repository.LoggerRepository
import dev.eknath.logger.EkhaLogger.repository.model.toLogGetModel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/logs")
class LogController(val repository: LoggerRepository) {

    @PostMapping("/new", consumes = ["application/json"])
    fun newLog(@RequestBody logModel: LogModel) {
        println(logModel)
        repository.save(logModel.toDBModel())
    }

    @GetMapping("/all")
    fun getLogs(): List<LogGetModel> {
        return repository.findAll().map { it.toLogGetModel() }
    }
}
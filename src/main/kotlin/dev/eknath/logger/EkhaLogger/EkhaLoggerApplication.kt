package dev.eknath.logger.EkhaLogger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EkhaLoggerApplication

fun main(args: Array<String>) {
	runApplication<EkhaLoggerApplication>(*args)
}

// go to
//http://localhost:8080/h2-console/ and copy past the db url from the terminal (search for h2 available at -> )
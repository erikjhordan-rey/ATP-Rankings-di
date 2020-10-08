package io.github.erikjhordanrey.atp_rankings_di.data

import io.github.erikjhordanrey.atp_rankings_di.core.testing.OpenForTesting

@OpenForTesting
class PlayerRepository(private val playerLocalDataSource: PlayerLocalDataSource) {

    fun getAllPlayers() = playerLocalDataSource.getAllPlayers()
}


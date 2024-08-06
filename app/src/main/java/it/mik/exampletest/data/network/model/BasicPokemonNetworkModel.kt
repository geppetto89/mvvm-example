package it.mik.exampletest.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BasicPokemonListNetworkModel(
    private val count: Int,
    private val next: String,
    private val previous: String,
    private val results: List<BasicPokemon>
)

@Serializable
data class BasicPokemon(
    private val name: String,
    private val url: String
)
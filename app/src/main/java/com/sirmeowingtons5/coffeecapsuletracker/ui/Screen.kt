package com.sirmeowingtons5.coffeecapsuletracker.ui

sealed class Screen(
    val route: String,
) {
    object Catalogue : Screen(CATALOGUE_ROUTE)
    data class Details(val id: String) : Screen("$DETAILS_ROUTE_PREFIX/$id")

    companion object {
        const val CATALOGUE_ROUTE = "catalogue"

        const val DETAILS_ARG = "id"
        const val DETAILS_ROUTE_PREFIX = "details"
        const val DETAILS_ROUTE = "$DETAILS_ROUTE_PREFIX/{$DETAILS_ARG}"
    }
}
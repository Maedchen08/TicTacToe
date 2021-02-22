package com.example.tictactoe08.presentation

interface OnNavigationListener {
    fun onRegistration(player1: String, player2: String)
    fun onSplash()
    fun onExit()
    fun onRule()
    fun onHaveWinner()
}
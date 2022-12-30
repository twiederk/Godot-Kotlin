package com.example.game

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.global.GD

@RegisterClass
class Simple : Node() {

    @RegisterFunction
    override fun _ready() {
		GD.print("Hello Kotlin")
    }

    @RegisterFunction
    fun add(summandA: Int, summandB: Int): Int {
        return summandA + summandB
    }
}

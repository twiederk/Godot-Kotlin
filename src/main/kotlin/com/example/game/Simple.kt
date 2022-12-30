package com.example.game

import com.d20charactersheet.framework.boc.model.Character
import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.global.GD

@RegisterClass
class Simple: Node() {

	@RegisterFunction
	override fun _ready() {
		val character = Character()
		character.name = "Belvador"
		GD.print(character.name)
	}

	@RegisterFunction
	fun add(summandA: Int, summandB: Int): Int {
		return summandA + summandB
	}
}

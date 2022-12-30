package com.example.game

import godot.Node
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SimpleTest : Node() {

    @Test
    fun test_add() {

        // act
        val result = Simple().add(2, 3)

        // assert
        assertThat(result).isEqualTo(5)

    }
}
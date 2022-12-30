extends Node2D


func _ready():
	var simple = com_example_game_Simple.new()
	print(str("sum: ", simple.add(2, 3)))

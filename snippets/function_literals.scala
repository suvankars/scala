#!/usr/bin/scala scala
!#

//A function is defined by 'def' key word 
//Method that returns a value  must end with '=' sign
//And must declare a return type 


def quack(q:String, u:String):String = {
  return q + u
} 

println(quack("quack ", "panck"))


//Deduced return type
//Return key word is optional

def cry(q:String, u:String) = {
  q + u
}

println(cry("mule ", "roar"))

//Curly braces are optional for single line block

def play(p: String, l: String) = p + l

println(play("Chess ", "Soccer")) 

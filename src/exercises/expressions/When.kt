package exercises.expressions

// Restricts type hierarchy (all subclasses must be defined in the same file
sealed class Expr

class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
    }

fun main() = println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))


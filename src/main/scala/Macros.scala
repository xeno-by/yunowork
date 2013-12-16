import scala.reflect.macros.Context
import scala.language.experimental.macros
import scala.reflect.api.Liftable

object liftableMacro {
  implicit def liftableCaseClass[T]: Liftable[T] = macro impl
  def impl(c: Context): c.Tree = {
    import c.universe._
    val spliced: List[Tree] = List(q"???")
    val s = ""
    q"Apply(Ident(TermName($s)), List(..$spliced))"
  }
}

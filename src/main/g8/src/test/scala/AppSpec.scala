package $organization$.$name;format="lower,word"$

import org.scalatest._

class AppSpec extends FlatSpec with Matchers {
  "The 'Hello world' string" should "contain 11 characters" in {
    assert("Hello world".length == 11)
  }
}

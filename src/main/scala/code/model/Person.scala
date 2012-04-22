package code.model

import net.liftweb.proto.ProtoUser
import net.liftweb.mapper._

/**
 * Created with IntelliJ IDEA.
 * User: Readman
 * Date: 4/22/12
 * Time: 1:57 AM
 * To change this template use File | Settings | File Templates.
 */

object Person extends Person with LongKeyedMetaMapper[Person]

class Person extends LongKeyedMapper[Person] with IdPK{
  def getSingleton = Person
  object firstname extends MappedString(this, 100)
  object lastname extends MappedString(this, 100)
}
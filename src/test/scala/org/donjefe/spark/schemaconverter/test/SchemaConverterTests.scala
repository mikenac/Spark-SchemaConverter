package org.donjefe.spark.schemaconverter.test

import org.scalatest._

import scala.io.Source

class SchemaConverterTests extends UnitSpec {

  private val simpleObject = Source.fromInputStream(getClass.getClassLoader.getResourceAsStream("SimpleObject.json")).mkString



  "A" should "B" in {

    assert(simpleObject.nonEmpty)
  }

}

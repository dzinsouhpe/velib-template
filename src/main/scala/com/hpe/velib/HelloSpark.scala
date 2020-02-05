package com.hpe.velib

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object HelloSpark {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    val sc = new SparkContext(conf)
    val spark = SparkSession.builder().appName("HelloSpark by HPE").config(conf).getOrCreate()

    spark.read.json("/user/dzinsou/velib24h").show(10)
  }
}

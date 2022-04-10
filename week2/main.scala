package scalaCoursera.week2.main
import common._

//object Main {
/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean // Например, мы можем создать псевдоним типа для любой функции, которая имеет параметр Int и возвращает boolean :
  // функция примет Int и вернет bool, set ее псевдоним
  //type IntToString = Int => String
  //(x: Int) => x < 0  тип FunSet = Int => Boolean
  /**
   * Функция проверки содержит ли данный элемент
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = (_ == elem)

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = (e: Int) => s(e) || t(e)

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` or `t`.
   */
  def intersect(s: Set, t: Set): Set = (e: Int) => s(e) && t(e)

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = (e: Int) => s(e) && !t(e)

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = (e: Int) => s(e) && p(e)

}
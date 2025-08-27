package io.github.nguyenyou.internal

import io.github.nguyenyou.logging.Logger

import scala.collection.immutable.{SortedMap, SortedSet}

package object phases {
  type IsCircular       = Boolean
  type GetDeps[Id, T]   = SortedSet[Id] => PhaseRes[Id, SortedMap[Id, T]]
  type Phase[Id, T, TT] = (Id, T, GetDeps[Id, TT], IsCircular, Logger[Unit]) => PhaseRes[Id, TT]
}

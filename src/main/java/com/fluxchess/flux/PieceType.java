/*
 * Copyright 2007-2014 the original author or authors.
 *
 * This file is part of Flux Chess.
 *
 * Flux Chess is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Flux Chess is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Flux Chess.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.fluxchess.flux;

public final class PieceType {

  public static final int MASK = 0x7;

  public static final int PAWN = 1;
  public static final int KNIGHT = 2;
  public static final int KING = 3;
  public static final int BISHOP = 5;
  public static final int ROOK = 6;
  public static final int QUEEN = 7;

  public static final int VALUES_SIZE = 8;
  public static final int[] values = {
      PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING
  };

  private PieceType() {
  }

}

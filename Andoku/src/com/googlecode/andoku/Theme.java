/*
 * Andoku - a sudoku puzzle game for Android.
 * Copyright (C) 2009  Markus Wiederkehr
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.googlecode.andoku;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;

import com.googlecode.andoku.model.PuzzleType;

interface Theme {
	char getSymbol(int value);

	Drawable getBackground();

	int getNameTextColor();
	int getDifficultyTextColor();
	int getSourceTextColor();
	int getTimerTextColor();

	Paint getGridPaint();
	Paint getRegionBorderPaint();
	Paint getExtraRegionPaint();
	Paint getValuePaint();
	Paint getDigitPaint();
	Paint getCluePaint(boolean preview);
	Paint getErrorPaint();
	Paint getMarkedCellPaint();
	Paint getMarkedCluePaint();

	boolean isDrawAreaColors(PuzzleType puzzleType);
	int getAreaColor(int colorNumber, int numberOfColors);

	Drawable getCongratsDrawable();
	Drawable getPausedDrawable();

	Drawable getPuzzleBackground();
	int getPuzzlePadding();
}

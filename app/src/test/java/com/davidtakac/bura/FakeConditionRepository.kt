/*
 * This file is part of Bura.
 *
 * Bura is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Bura is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Bura. If not, see <https://www.gnu.org/licenses/>.
 */

package com.davidtakac.bura

import com.davidtakac.bura.units.Units
import com.davidtakac.bura.condition.ConditionPeriod
import com.davidtakac.bura.condition.ConditionRepository
import com.davidtakac.bura.place.Coordinates

class FakeConditionRepository(private val cannedPeriod: ConditionPeriod) : ConditionRepository {
    override suspend fun period(coords: Coordinates, units: Units): ConditionPeriod = cannedPeriod
}
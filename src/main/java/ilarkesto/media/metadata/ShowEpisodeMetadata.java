/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package ilarkesto.media.metadata;

import ilarkesto.base.Str;
import ilarkesto.media.AMetadata;

public class ShowEpisodeMetadata extends AMetadata {

	public String getShowTitle() {
		return get("showTitle");
	}

	public String getSeasonTitle() {
		return get("seasonTitle");
	}

	public Integer getSeasonNumber() {
		return getInteger("seasonNumber");
	}

	public String getTitle() {
		return get("title");
	}

	public Integer getNumber() {
		return getInteger("number");
	}

	@Override
	public String getFullTitle() {
		String season = "S" + Str.fillUpLeft(String.valueOf(getSeasonNumber()), "0", 2);
		String episode = "E" + Str.fillUpLeft(String.valueOf(getNumber()), "0", 2);
		return getShowTitle() + " - " + season + episode + " - " + getTitle();
	}

}

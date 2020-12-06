package com.palmergames.bukkit.towny.event.town.toggle;

import org.bukkit.command.CommandSender;
import com.palmergames.bukkit.towny.object.Town;

public class TownToggleNeutralEvent extends TownToggleEvent {

	private final boolean state;
	
	public TownToggleNeutralEvent(CommandSender sender, Town town, boolean admin) {
		super(sender, town, admin);
		state = town.isNeutral();
	}

	/**
	 * @return the current toggle's state.
	 */
	public boolean getCurrentState() {
		return state;
	}
	
	/**
	 * @return the future state of the toggle after the event.
	 */
	public boolean getFutureState() {
		return !state;
	}

}

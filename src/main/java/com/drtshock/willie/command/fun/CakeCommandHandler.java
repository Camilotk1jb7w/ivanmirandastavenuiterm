package com.drtshock.willie.command.fun;

import java.util.ArrayList;
import java.util.Random;

import org.pircbotx.Channel;
import org.pircbotx.User;

import com.drtshock.willie.Willie;
import com.drtshock.willie.command.CommandHandler;

/**
 * @author stuntguy3000
 */
public class CakeCommandHandler implements CommandHandler {

	private Random rand;
	private ArrayList<String> messages;

	public CakeCommandHandler() {
		this.rand = new Random();
		this.messages = new ArrayList<>();

		this.messages.add("The cake is a lie!");
		this.messages.add("The cake isn't a lie!");
		this.messages.add("The cake could be a lie!");
		this.messages.add("Think with portals");
	}

	@Override
	public void handle(Willie bot, Channel channel, User sender, String[] args) {
		channel.sendMessage(this.messages.get(this.rand.nextInt(this.messages.size())));
	}
}

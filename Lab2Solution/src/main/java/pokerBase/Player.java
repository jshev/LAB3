package pokerBase;

import java.util.UUID;

public class Player {
	
	private UUID PlayerID;
	private String PlayerName;
	private int PlayerSeat;
	
	public void PlayerID(UUID PlayerID) {
		PlayerID = UUID.randomUUID();
	}
	
	public void PlayerName(String strPlayerName) {
		this.PlayerName = strPlayerName;
	}
	
	public void PlayerPosition(int PlayerSeat) {
		this.PlayerSeat = PlayerSeat;
	}

	public UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getPlayerSeat() {
		return PlayerSeat;
	}

	public void setPlayerSeat(int playerSeat) {
		PlayerSeat = playerSeat;
	}

}
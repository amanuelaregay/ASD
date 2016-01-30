package dal;

import database.DBTables;
import entities.Party;

public class PartyDAOImp implements PartyDAO {

	@Override
	public boolean addParty(Party party) {
		
		DBTables.Party_TABLE.add(party);
		
		return false;
	}

	
	
	
}

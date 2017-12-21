package com.rs.game.player.content.squeal;

import com.rs.game.item.Item;

public class SquealSlotItems {

	public static Item[] SUPER_RARE_ITEM = { // This is for what slot it is in
		new Item(995, 200000000), // remove
		new Item(995, 10000000), // remove
		new Item(1038), // To add an item make a new line and add "new Item()" put the item id in the bracket
		new Item(1040), // Add a comma ONLY if it is not the last item
		new Item(1042), // To change an item just replace the ID
		new Item(1046), // Add a comment next to what you change
		new Item(1048), 
		new Item(1050), 
		new Item(26241) 
	};
	public static Item[] RARE_SLOT1 = { // Multiple slots are so the same items don't overlap although its fine if some do
		new Item(23715), // 1419
		new Item(23679), // remove
		new Item(23680), // remove
		new Item(23681), // remove
		new Item(23682), // remove
		new Item(23683), // remove
		new Item(23690) // remove
	};
	public static Item[] RARE_SLOT2 = { 
		new Item(23684), // 1050
		new Item(23685), // 1050
		new Item(23686), // 1050
		new Item(23687), // 1050
		new Item(23688), // 1050
		new Item(23689) // 30412
	};
	public static Item[] RARE_SLOT3 = { 
		new Item(23691), // 962
		new Item(23692), // remove
		new Item(23693), // remove
		new Item(23694), // remove
		new Item(23695), // remove
		new Item(23696), // remove
		new Item(23697), // remove
		new Item(23698), // remove
		new Item(23699), // remove
		new Item(23700) // remove
	};
	public static Item[] UNCOMMON_SLOT1 = { 
		new Item(9181), // 1053
		new Item(9183), // remove
		new Item(857) // remove
	};
	public static Item[] UNCOMMON_SLOT2 = { 
		new Item(1119), // 1055
		new Item(1121), // remove
		new Item(1123), // remove
		new Item(1127) // remove
	};
	public static Item[] UNCOMMON_SLOT3 = { 
		new Item(12976), // 1057
		new Item(1133), // remove
		new Item(23714) // remove
	};
	public static Item[] COMMON_SLOT1 = {
		new Item(23713), // remove
		new Item(9177), // 1961
		new Item(9179), // remove
		new Item(9174) // remove
	};
	public static Item[] COMMON_SLOT2 = {
		new Item(2, 30), // 1959
		new Item(886, 300) // remove
	};
	public static Item[] COMMON_SLOT3 = { 
		new Item(1515, 15), // 981
		new Item(444, 20) // remove
	};
	public static Item[] COMMON_SLOT4 = { 
		new Item(563, 40), // 995 dunno how many coins
		new Item(843), // remove
		new Item(1325), // remove
		new Item(1313), // remove
		new Item(1361) // remove
	};
	public static Item[] COMMON_SLOT5 = { 
		new Item(1367), // 1959
		new Item(1297), // remove
		new Item(1327), // remove
		new Item(1205) // remove
	};
	public static Item[] COMMON_SLOT6 = { 
		new Item(853), // 1961
		new Item(1311), // remove
		new Item(1365), // remove
		new Item(1353), // remove
		new Item(1295), // remove
		new Item(1325) // remove
	};
	// IGNORE EVERYTHING BELOW THIS YOU DONT NEED TO CHANGE ANYTHING
	public static Item getSRare() {
		return SUPER_RARE_ITEM[(int) (Math.random() * SUPER_RARE_ITEM.length)];
	}

	public static Item getRare(int slot) {
		return slot == 2 ? RARE_SLOT2[(int) (Math.random() * RARE_SLOT2.length)] :
			   slot == 3 ? RARE_SLOT3[(int) (Math.random() * RARE_SLOT3.length)] :
					RARE_SLOT1[(int) (Math.random() * RARE_SLOT1.length)];
	}

	public static Item getCommon(int slot) {
		return slot == 2 ? COMMON_SLOT2[(int) (Math.random() * COMMON_SLOT2.length)] :
			   slot == 3 ? COMMON_SLOT3[(int) (Math.random() * COMMON_SLOT3.length)] :
			   slot == 4 ? COMMON_SLOT4[(int) (Math.random() * COMMON_SLOT4.length)] :
			   slot == 5 ? COMMON_SLOT5[(int) (Math.random() * COMMON_SLOT5.length)] :
			   slot == 6 ? COMMON_SLOT6[(int) (Math.random() * COMMON_SLOT6.length)] :
				   COMMON_SLOT1[(int) (Math.random() * COMMON_SLOT1.length)];
	}

	public static Item getUnCommon(int slot) {
		return slot == 2 ? UNCOMMON_SLOT2[(int) (Math.random() * UNCOMMON_SLOT2.length)] :
			   slot == 3 ? UNCOMMON_SLOT3[(int) (Math.random() * UNCOMMON_SLOT3.length)] :
				   UNCOMMON_SLOT1[(int) (Math.random() * UNCOMMON_SLOT1.length)];
	}
	
}

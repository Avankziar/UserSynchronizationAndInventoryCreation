package main.java.me.avankziar.mim.spigot.cmdtree;

public enum CommandExecuteType
{
	MIM, // /mim | Zeigt alle Befehle an.
	MIM_SAVEANDKICK,
	MIM_SAVE,
	GAMEMODE,
	WORKBENCH,
	ENDERCHEST,
	ENCHANTINGTABLE,
	ANVIL,
	INVSEE,
	ARMORSEE,
	CLEAR,
	CLEAR_ATTRIBUTE,
	CLEAR_EFFECT,
	CLEAR_EXP,
	CLEAR_FULL,
	CLEAR_INV,
	CLEAR_INVONLY,
	CLEAR_ARMOR,
	CLEAR_EC,
	CLEAR_OFFHAND,
	CLEAR_PERSISTENTDATA,
	WHOIS,
	ONLINE,
	FLY,
	ATTRIBUTES,
	INV_DEATH_LOAD,
	INV_DEATH_LIST,
	WAITINGITEMS,
	WAITINGITEMS_LIST,
	WAITINGITEMS_ACCEPT,
	SENDITEM,
	SENDITEM_HAND,
	SENDITEM_MATERIAL,
	SENDITEM_INV,
	PREDEFINEPLAYERSTATE,
	PREDEFINEPLAYERSTATE_CREATE,
	PREDEFINEPLAYERSTATE_LOAD,
	PREDEFINEPLAYERSTATE_DELETE,
	CUSTOMPLAYERINVENTORY, // /xyz | Alle Befehle für die CPI gemeint sind.
	CPI_DROP,
	CPI_INFO,
	CPI_SEE,
	CPI_BUY
}

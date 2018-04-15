package com.consolerpg.character;

/**
 * 戦闘する生き物を表す抽象クラス
 * @author obscure12
 *
 */
public abstract class BattleCreature implements Creature{

	/**
	 * HPを取得する
	 * @return HP
	 */
	public abstract int getHp();

	/**
	 * レベルを取得する
	 * @return レベル
	 */
	public abstract int getLevel();

}

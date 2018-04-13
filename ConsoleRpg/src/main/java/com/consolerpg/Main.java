package com.consolerpg;

import com.consolerpg.character.hero.Hero;
import com.consolerpg.character.monster.GhostFungus;

/**
 * コンソールRPGのメインクラス
 * @author obscure12
 *
 */
public class Main {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Hero hero = new Hero("ミナト", "男");
		hero.attack();
		hero.run();

		GhostFungus ghostFungus = new GhostFungus("お化けキノコ");
		ghostFungus.attack();
		ghostFungus.gushPoisonGas();
	}
}

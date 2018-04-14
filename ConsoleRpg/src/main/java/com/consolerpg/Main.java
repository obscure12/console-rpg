package com.consolerpg;

import java.util.Scanner;

import com.consolerpg.character.hero.Hero;
import com.consolerpg.character.monster.GhostFungus;
import com.consolerpg.character.person.Villager;

/**
 * コンソールRPGのメインクラス
 * @author obscure12
 *
 */
public class Main {

	/** 「助ける」の選択 */
	private static final String HELP_SELECTION = "1";

	/** HPの最低ライン */
	private static final int DEAD_LINE = 0;

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Hero hero = new Hero("ミナト", "男");
		GhostFungus ghostFungus = new GhostFungus("お化けキノコ");
		Villager villager = new Villager("村人");

		System.out.println(villager.getName() + "が" + ghostFungus.getName() + "に襲われている");
		villager.help();

		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			String selection = null;

			while (!HELP_SELECTION.equals(selection)) {
				System.out.print("どうする？（1:助ける　2:助けない）：");
				selection = scan.nextLine();
			}

		} finally {
			scan.close();
		}

		while (ghostFungus.getHp() > DEAD_LINE) {
			// お化けキノコのHPが残っている場合
			hero.attack(ghostFungus);
			System.out.println("[" + ghostFungus.getName() + "のHP] " + ghostFungus.getHp());

			if (DEAD_LINE >= ghostFungus.getHp()) {
				// お化けキノコのHPが0以下の場合
				System.out.println(hero.getName() + "は勝利した");
			}
		}

	}
}
